public class greaterOfThree {
    public static void main(String[] args) {
        int a=4,b=88,c=522;

        if(a>b){
            System.out.println(a);
            if(a>c){
                System.out.println(a);
            }
            else {
                System.out.println(c);
            }
        }else {
            if(b>c){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }


    }
}
