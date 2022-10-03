package br.ce.wcquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.servicos.LocacaoService;
import br.ce.wcaquino.utils.DataUtils;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertTrue;

public class LocacaoServiceTest {

  @Test
  public void teste(){
//   cenario
    LocacaoService service = new LocacaoService();
    Usuario usuario = new Usuario("Usuario 1");
    Filme filme = new Filme("Filme 1", 2, 5.0);

//   açao
    Locacao locacao = service.alugarFilme(usuario, filme);

//   Vericação
    assertTrue(locacao.getValor() == 5.0);
    assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
    assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));

  }
}
