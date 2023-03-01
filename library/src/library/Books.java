
import java.util.Scanner;

public class Books {
    
    Scanner scan = new Scanner(System.in);
	
        private String book;

        String[] books = {"Mulherzinhas -   Louisa May Alcott",
			"Alice no Pais das Maravilhas - Lewis Carroll",
			"Admiravel mundo novo - Aldous Huxley",
			"O codigo Da Vinci - Dan Brown",
			"O principe - Maquiavel",
			"O leviata - Thomas Hobbs"};
	
            public void choose(){ 
		
                int esc;
                
                do{
                    
                    for(int l=0;l<books.length;l++){
                        System.out.println(l+1+" : "+books[l]);
                    }
                    System.out.println("");
                    
                    esc = scan.nextInt();
                    
                    switch(esc){
                        case 1:
                        book=books[0];
                        setBook(book);
                            break;
                        case 2:
                        book=books[1];
                        setBook(book);
                            break;
                        case 3:
                        book=books[2];
                        setBook(book);
                            break;
                        case 4:
                        book=books[3];
                        setBook(book);
                            break;
                        case 5:
                        book=books[4];
                        setBook(book);
                            break;
                        case 6:
                        book=books[5];
                        setBook(book);
                            break;
                        default: System.out.println("\nEscolha uma opcao valida!\n");
                        break;
                    }
                }while(esc!=1 && esc!=2 && esc!=3 && esc!=4 && esc!=5 && esc!=6);
            }

            public void finalize(){
                System.out.println("\nEtapa Livro finalizada!\n");
            }
        
            public String getBook() {
                return book;
            }
        
            public void setBook(String book) {
                this.book = book;
            }
}
