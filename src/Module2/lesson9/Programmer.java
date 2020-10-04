package Module2.lesson9;

public class Programmer {
    private String name;
    private int age;
    private Experience experience;

    public static class Experience{
        private int summary;

        public Experience(int age) {
            summary = (age-20)/2;
        }
    }

    public static class Stack{
        private String[] skills;

        public Stack(String[] skills) {
            this.skills = skills;
        }
    }

    public Programmer(String name, int age) {
        this.name = name;
        if(age > 20) {
            this.age = age;
            experience = new Experience(age);
        }else
        {
            System.out.println("Error!");
        }
    }


    public String analysis(Stack stack){
        if(stack.skills.length == 0){
            return "Is absent";
        }else{
            if(stack.skills.length > 0 && stack.skills.length <= 4){
                return "Weak";
            }else{
                if(stack.skills.length > 4 && stack.skills.length <= 8){
                   return "Serious, establish surveillance!";
                }else{
                    if(stack.skills.length > 8 && stack.skills.length <= 12)
                    {
                        return "Dangerous, send Smith to him!";
                    }else{
                        return "He is the chosen one...";
                    }
                }
            }
        }
    }
}
