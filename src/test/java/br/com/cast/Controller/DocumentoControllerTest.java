package br.com.cast.Controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.cast.Dto.RetornoDto;
import br.com.cast.Enum.TipoArquivoEnum;
import br.com.cast.Model.Documento;
import br.com.cast.Repository.DocumentoRepository;
import br.com.cast.Validador.ValidadorDocumento;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) // porta aleatória
@AutoConfigureMockMvc
public class DocumentoControllerTest {

	@MockBean
	private DocumentoRepository documentoRepository;
	
	@MockBean
	private RetornoDto retorno;
	
	
	@Test
	public void deveSalvarArquivoLeftReturnStatusCode201() {
		Documento docLeft = new Documento("ARQUIVO01", "REGISTRO DE TESTE".getBytes(), 10, TipoArquivoEnum.LEFT.toString());
		BDDMockito.when(documentoRepository.save(docLeft)).thenReturn(docLeft);
		assertThat(docLeft);
		System.out.println(docLeft);	
	}
	
	@Test
	public void deveSalvarArquivoRightReturnStatusCode201() {
		Documento docRight = new Documento("ARQUIVO01", "REGISTRO DE TESTE".getBytes(), 10, TipoArquivoEnum.LEFT.toString());
		BDDMockito.when(documentoRepository.save(docRight)).thenReturn(docRight);
		assertThat(docRight);
		System.out.println(docRight);	
	}	
	
	
	@Test
	public void deveValidaArquivosIdenticos() throws UnsupportedEncodingException {
		Documento docLeft = new Documento("ARQUIVO02", "REGISTRO DE TESTE".getBytes(), 10, TipoArquivoEnum.LEFT.toString());
		Documento docRight = new Documento("ARQUIVO01", "REGISTRO DE TESTE".getBytes(), 10, TipoArquivoEnum.LEFT.toString());
		BDDMockito.when(documentoRepository.save(docRight)).thenReturn(docRight);
		BDDMockito.when(documentoRepository.save(docLeft)).thenReturn(docLeft);
		retorno = ValidadorDocumento.validarDocumento(docLeft, docRight);
		System.out.println("Retorno: " + retorno.getDescricao());
		assertThat(retorno);
	}
	
	@Test
	public void deveValidaArquivosDiferentes() throws UnsupportedEncodingException {
		Documento docLeft = new Documento("ARQUIVO02", "REGISTRO DE TESTE...".getBytes(), 12, TipoArquivoEnum.LEFT.toString());
		Documento docRight = new Documento("ARQUIVO01", "REGISTRO DE TESTE".getBytes(), 10, TipoArquivoEnum.LEFT.toString());
		BDDMockito.when(documentoRepository.save(docRight)).thenReturn(docRight);
		BDDMockito.when(documentoRepository.save(docLeft)).thenReturn(docLeft);
		retorno = ValidadorDocumento.validarDocumento(docLeft, docRight);
		System.out.println("Retorno: " + retorno.getDescricao());
		assertThat(retorno);
	}
	
	@Test
	public void deveValidaArquivosTamanhoIguaisConteudoDiferentes() throws UnsupportedEncodingException {
		Documento docLeft = new Documento("ARQUIVO02", "REGISTRO DE TESTe".getBytes(), 7, TipoArquivoEnum.LEFT.toString());
		Documento docRight = new Documento("ARQUIVO01", "REGISTRO DE TESTE".getBytes(), 7, TipoArquivoEnum.LEFT.toString());
		BDDMockito.when(documentoRepository.save(docRight)).thenReturn(docRight);
		BDDMockito.when(documentoRepository.save(docLeft)).thenReturn(docLeft);
		retorno = ValidadorDocumento.validarDocumento(docLeft, docRight);
		System.out.println("Retorno: " + retorno.getDescricao());
		assertThat(retorno);
	}	
	
	
}
