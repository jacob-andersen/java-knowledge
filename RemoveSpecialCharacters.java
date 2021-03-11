public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        
        String text = "%fd76$fd(-)6GVKLO.";
        String newText = text.replaceAll("[`~!@#$%^&*(){}|;:',<.>/?']", "");
        System.out.println(newText);
    }
}