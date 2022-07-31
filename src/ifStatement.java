public class ifStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSent = 3;

        if(isBluetoothEnabled){
            //Send file
            fileSent++;
            System.out.println("file sent");
            System.out.println("the file has been sent "+fileSent+ " times");
        }else{
            System.out.println("The file don't sent");
        }
    }
}
