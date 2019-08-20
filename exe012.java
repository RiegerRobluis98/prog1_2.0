    	public static void main(String[] args) {
	// Declarações
	Scanner key = new Scanner (System.in);
       int h, m, s, ts;
	// Entrada
            System.out.println("Digite as Horas");
            h = key.nextInt();
            System.out.println("Digite os Minutos");
            m = key.nextInt();
            System.out.println("Digite os Segundos");
            s = key.nextInt();
	// Processamento
	ts = (h * 3600) + (m * 60) + s;
	// Saída
	           System.out.println("Total: "+ts+" Segundos");	
	}

}
