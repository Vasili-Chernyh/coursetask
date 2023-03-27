//- 4 билет
//
//    Какие есть способы создания объекта String? Где он создается?
//
//    Дайте определение классу в Java.
//
//    - Задача
//
//        Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.

public class Main {
    public static void main(String[] args) {
        String a = "qwerty"; // прямое присваивание

        String b = new String("qwerty"); // конструктор

        String[] arr = {"cat", "dog", "bird", "snake", "cat", "bug", "sheep", "bug"};
        for (int i = 0; i < arr.length; i++) {
            String current = arr[i];
            for (int j = 0; j < arr.length; j++){
                if (i != j && arr[i] != null) {          //Сравниваем элемент массива с другими элементами, когда индексы элементов неравны
                    if (current.equals(arr[j])) {        //(то есть не сравниваем элемент с самим собой)
                        arr[i] = null;
                        arr[j] = null;

                    }
                }
            }
        }
        for (String s : arr) {
            System.out.print(s);
        }
    }
}