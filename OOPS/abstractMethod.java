abstract class programming{
    public abstract void developer();
    public abstract void rank();
}
abstract class html extends programming{
    @Override
    public void developer(){
        System.out.println("Tim berners");
    }
}
class java extends html{
    @Override
    public void rank(){
        System.out.println("3rd");
    }
}


public class abstractMethod {
    public static void main(String[] args) {
        programming r=new java();
        r.developer();
        r.rank();
    }    
}
