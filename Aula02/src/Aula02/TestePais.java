package Aula02;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestePais {
	Pais pais, copia;
	static int id = 0;

	/*
	 * Antes de rodar este teste, certifique-se que nao ha no banco nenhuma linha
	 * com o id igual ao do escolhido para o to instanciado abaixo. Se houver,
	 * delete. Certifique-se também que sobrecarregou o equals na classe Pais.
	 * Certifique-se que a fixture pais1 foi criada no banco. Além disso, a ordem
	 * de execução dos testes é importante; por isso a anotação FixMethodOrder logo
	 * acima do nome desta classe
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		pais = new Pais(id, "Vaticano", 831, 0.44);
		copia = new Pais(id, "Vaticano", 831, 0.44);
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}

	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		// para funcionar o pais 1 deve ter sido carregado no banco por fora
		Pais fixture = new Pais(1, "China", 1415045928, 9388211);
		Pais novo = new Pais(1, null, 0, 0);
		novo.carregar();
		assertEquals("testa inclusao", novo.getId(), fixture.getId());
	}

	@Test
	public void test01Criar() {
		System.out.println("criar");
		pais.criar();
		id = pais.getId();
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", pais.getId(), copia.getId());
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.setPopulacao(9999990);
		copia.setPopulacao(999999);
		pais.atualizar();
		pais.carregar();
		assertEquals("testa atualizacao", pais.getId(), copia.getId());
	}

	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(0);
		copia.setArea(0);
		pais.excluir();
		pais.carregar();
		assertEquals("testa exclusao", pais.getId(), copia.getId());
	}
	
	/*@Test
	public void test04MaiorPopulacacao() {
		System.out.println("maior populacao");
		Pais novo = new Pais(1, "China", 1415045928, 9388211);
		pais.maiorPopulacao();
		assertEquals("testa maior populacao", pais.getId(), novo.getId());
	}
	
	@Test
	public void test05MenorArea() {
		System.out.println("menor area");
		Pais copia = new Pais(233, "Santa Sé", 801, 0.44);
		Pais novo = new Pais();
		novo = novo.menorArea();
		assertEquals("Teste de menor área", copia.getId(), novo.getId());
	}*/
}