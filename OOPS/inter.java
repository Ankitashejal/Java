public class inter {
    public static void main(String[] args) {
        
    }
}
//why interface is needed?
//multiple inheritance ko implement karna 
//to achieve total abstraction
//defined by interface keyword...for inherting implement is used


interface chessplayer{
    void moves();

}
class queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }

}
class rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }

}
class king implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }

}

