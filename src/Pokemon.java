import java.util.List;

public abstract class Pokemon {

        private String name;
        private int level;
        private int hp;
        private String food;
        private String sound;
        protected String type;

        public Pokemon (String name, int level, int hp, String food, String sound) {
            this.name = name;
            this.level = level;
            this.hp = hp;
            this.food = food;
            this.sound = sound;
        }

    public Pokemon (String name, int level, int hp, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }



    public String getType() {
        return type;
    }

    public String getName(){
            return name;
        }

        public int getLevel(){
            return level;
        }

        public int getHp(){
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public String getFood(){
            return food;
        }

        public String getSound(){
            return sound;
        }


    protected abstract void attack(Pokemon opponent);


    public void eat(){
        if (food.equals(this.getFood())){
            this.setHp(getHp() + 70);
            System.out.println(getName() + " has eaten the food and gained some hp, the new hp of the pokemon is " + this.getHp() );
        }
    }
}

