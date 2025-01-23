class genericsEx<T,S> { 
    genericsEx(T t,S s){
        System.out.println(t);
        System.out.println(s);
    }
}

class generics{
    public static void main(String[] args) {
        genericsEx<Integer,String> gn=new genericsEx<Integer,String>(10,"Ranadeb");
    }
}
