package excecoes;

public class Conexao implements AutoCloseable {//implements definir contrato 
	 public Conexao() {
	        System.out.println("Abrindo conexao");
	        throw new IllegalStateException();
	    }

	    public void leDados() {
	        System.out.println("Recebendo dados");
	         throw new IllegalStateException();
	    }


		@Override
		public void close() {
			// TODO Auto-generated method stub
			
		}
	}