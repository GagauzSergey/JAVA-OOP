package Developers;

/**
 * Created by user on 20.11.2016.
 */
    public class MiddleToSenior extends Developer {

        public MiddleToSenior(String type,String name, int basicSalary, int experience) {
            super(type, name, basicSalary, experience);
        }

        @Override
        public double getSalary() {
            return (basicSalary * 1.2) + (experience > 0 ? basicSalary * experience * 0.1 : 0);
        }
    }

