public class Main{

    public static void main(String[] args){
        String[] list = {"Hello", "I", "am", "a", "list"};
        String word = "test";
        print(word);
        forLoopList(list);
        forLoopWord(word);
        third_decision(1);}


    public static void print(String word){
        System.out.println(word);
    }

    public static void forLoopList(String[] list){
        for(String word:list){
            System.out.println(word);
        }
    }

    public static void forLoopWord(String word){
        for(int index = 0; index < word.length(); index++){
            System.out.println(word.charAt(index));
        }
    }

    private static void third_decision(int num) {
        int my_num = 15;
        if (num>my_num){
            System.out.println("your number is strong");
        }else if (my_num == num){
            System.out.println("our numbers is equal to rand");
        }else{
            System.out.println("my number is stronger");
        }

    private static void second_decision(int numb) {
        int a_num = 29 ;
        if (numb>a_num){
            System.out.println("your number is strong");
        }else{
            System.out.println("dollar is stronger");
        }
    }
}}

//1. Data types, the importance of them
//2. Hello, world
//3. Variable Declaring
//4. if statements
//5. loops