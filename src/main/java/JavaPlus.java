public class JavaPlus {

    static class Car {
        private String carBrand;
        private String carType;
        private int carYear;

    public Car() {}

    public Car(String carBrand, String carType) {
        this.carBrand = carBrand;
        this.carType = carType;
        }

        public Car(String carBrand, String carType, int carYear) {
        this.carBrand = carBrand;
        this.carType = carType;
        this.carYear = carYear;
        }

        public String getCarBrand() {
            return carBrand;
        }

        public void setCarBrand(String carBrand) {
            this.carBrand = carBrand;
        }

        public String getCarType() {
            return carType;
        }

        public void setCarType(String carType) {
            this.carType = carType;
        }

        public int getCarYear() {
            return carYear;
        }

        public void setCarYear(int carYear) {
            this.carYear = carYear;
        }

    }
}
