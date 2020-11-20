public class Cat {
    public String name;
    public int appetite;
    public boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {
        if(p.food>appetite) {
            p.decreaseFood(appetite);
            this.satiety = true;
            System.out.println(this.name + " поел. Сытость = " + true);
            p.info();
        }
        else{
            System.out.println(this.name + " не ел. Сытость = " + this.satiety+". Добавьте еды.");
            }
        p.addFood();
        }
    }


