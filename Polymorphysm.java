class Polymorphysm {
    public static void main(String[] args){
     Polymorphysm iam = new Polymorphysm();
     System.out.println(iam.add(1,2,3));
    }
    public int add (int a, int b){
        return a+b;
    }
     public int add (int a, int b,int c){
        return a+b+c;
    }
}