public class Main{

    public static void main(String[] args){
        String[] list = {"Hello", "I", "am", "a", "list"};
        String word = "Hello, I am a String";
        print(word);
        forLoopList(list);
        forLoopWord(word);
}

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
}