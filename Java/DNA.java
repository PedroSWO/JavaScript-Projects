// DNA Sequencing
public class DNA{

    public static void main(String[] args){
  
      String dna1 = "ATGCGATACGCTTGA";
      String dna2 = "ATGCGATACGTGA";
      String dna3 = "ATTAATATGTACTGA";
  
      //Uncomment to test all DNA strands
      String dna = dna1;
      //String dna = dna2;
      //String dna = dna3;
  
      System.out.println(dna.length());
  
      int start = dna.indexOf("ATG");
      System.out.println("Codon starts at: " + start);
      int stop = dna.indexOf("TGA");
      System.out.println("Codon ends at: " + stop);
  
      if(start != -1 && stop != -1 && (start + stop) % 3 == 0){
        String protein = dna.substring(start, stop+3);
        System.out.println("Protein: " + protein);
      }else{
        System.out.println("No protein");
      }
    }
  }