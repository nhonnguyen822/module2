package ss10_danh_sach;

import java.util.ArrayList;

public class TextList {
    public static class Students {
        private int id;
        private String name;

        public Students() {
        }

        public Students(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Students{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Students students1 = new Students(1, "Nhon1");
        Students students2 = new Students(2, "Nhon2");
        Students students3 = new Students(3, "Nhon3");
        Students students4 = new Students(4, "Nhon4");
        Students students5 = new Students(5, "Nhon5");
        Students students6 = new Students(6, "Nhon6");
        Students students7 = new Students(7, "Nhon7");
        Students students8 = new Students(7, "Nhon8");
        MyList<Students> myList = new MyList<>();
        myList.add(students1);
        myList.add(students2);
        myList.add(students3);
        myList.add(students4);
        myList.add(students5);
        myList.add(students6);
        myList.size();
        myList.remove(3);
        myList.get(5);
        myList.add(3, students7);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        MyList<Students> hocSinh = myList.clone();
        for (int i = 0; i < hocSinh.size(); i++) {
            System.out.println(hocSinh.get(i));
        }
        System.out.println(hocSinh.indexOf(students8));
        hocSinh.clear();
        System.out.println(hocSinh.size());
    }
}
