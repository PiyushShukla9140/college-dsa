// An interface is a blueprint that specifies what a class must do, without necessarily specifying how it does it.
// interfaces are implemented using implements keyword
// interfaces are used for total abstraction, this was taught in traditoial java but modern java also includes default, static, private etc
// Java does not support multiple inheritance through classes, but it supports multiple inheritance through interfaces.(single child class inherits from multiple parnets)



// Interface abstract methods are implicitly public and abstract.
// Variable in interfaces are final, public, static 


/*
class → extends → class

class → implements → interface

interface → extends → interface
 */

interface ChessPlayer{
    void moves(); // this method is implicitly or by default public and abstract
    // it is implemented like this under the hood
    // public abstract void moves
}

class Queen implements ChessPlayer{
    public void moves(){ // as in interface the function is public, we need to make this also public else this method will be treated as default
        System.out.println("Queen moves left, right, up, down, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Rook moves left, right , up and down by 1 step");
    }
}

public class Interface{
    public static void main(String[]args){
        Queen q = new Queen();
        q.moves();

    }
}