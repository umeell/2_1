class Main {
  public static void main(String[] args) {
    String y="*";
    int spacja = 4;
    for(int k = 0;k<=1;k++){
      spacja = 4;
      y="*";
      for(int j = 0;j<5;j++){
        for(int z = 0;z<spacja;z++){
          System.out.print(" "); 
          }
        for(int a = 0;a<j;a++){
          System.out.print(y);
        }
        spacja--;
        System.out.println();
        }
      y="*";
      for(int i=0;i<=3;i++){
        System.out.print("   ");
        System.out.print(y);
        if(i<3){
        System.out.println();
          } 
        y=y+"*";
        }
      }
    }
  }