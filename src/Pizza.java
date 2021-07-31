public abstract class Pizza {
    String name;
    String[] ingredient;
    String base;
    String sauce;
    String time;

    public void prepare(){
        System.out.println("Chuẩn bị chế biến " + name);
        if (ingredient != null){
            for (int i = 0; i < ingredient.length; i++) {
                System.out.println("Nguyên liệu thứ " + i + " : " + ingredient[i]);
            }
        }
    }

    public void bake(){
        System.out.println("Nướng bánh " + time);
    }

    public void cut(){
        System.out.println("Cắt bánh");
    }
}
