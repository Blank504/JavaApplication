 class Constructor{
    byte wheel;
    double price;
    String color;
     Constructor(byte wheel,double price,String color){
     this.wheel=wheel;
     this.price=price;
     this.color=color;
    }
    void displayVehicle(){
        // System.out.println("Wheel:%d,Price:%f,Color:%s",wheel,price,color );
        System.out.println("Wheel:" + wheel + "Price:"+ price +"Color:"+color);
    }
    public static void main(String[] args){
        byte wh  = 8;
     Constructor vehicle= new Constructor(wh,23.4,"meow");
     vehicle.displayVehicle();
    }10
}