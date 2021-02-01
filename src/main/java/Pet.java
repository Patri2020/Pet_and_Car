import java.util.Scanner;

        class Pet {

            private String petName;
            private int petAge;
            private String petLocation;
            private String petType;

            public Pet() {
                System.out.println("blank");
            }

            public Pet(String petName, int petAge, String petType, String petLocation) {
                this.petName = petName;
                this.petAge = petAge;
                this.petType = petType;
                this.petLocation = petLocation;
            }

            public String getPetName() {
                return petName;
            }

            public int getPetAge() {
                return petAge;
            }

            public String getPetType() {
                return petType;
            }

            public void setPetName(String petName) {
                this.petName = petName;
            }

            public void setPetAge(int petAge) {
                this.petAge = petAge;
            }

            public void setPetLocation(String petLocation) {
                this.petLocation = petLocation;


            }
        }



