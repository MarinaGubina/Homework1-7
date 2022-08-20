import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
// Задание 1

        System.out.println("Задание 1");
        String firstName = " Ivan ";
        String middleName = " Ivanovich ";
        String lastName = " Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

// Задание 2

        System.out.println("Задание 2");
        String upperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperFullName);

// Задание 3

        System.out.println("Задание 3");
        String fullName3 = "Иванов Семён Семёнович";
        String fullNameWithoutE = fullName3.replace('ё','е');
        System.out.println("Данные ФИО сотрудника - " + fullNameWithoutE);

// Задание 4
        /*
        Задание 4
К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
В качестве исходных данных используйте:
Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
переменная firstName — для хранения имени;
переменная middleName — для хранения отчества;
переменная lastName — для хранения фамилии.
Решите задание с помощью метода substring().
Результат программы выведите в формате:
“Имя сотрудника — …”
“Фамилия сотрудника — …”
“Отчество сотрудника — ...”
 Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено. Их должен вычислить компьютер.
 Подсказка - Определить индексы символов помогут методы indexOf() и lastIndexOf().
Критерии оценки
– При изменении содержания строки результат программы выполняется.
– Программа решена с помощью метода substring().
– Результат программы выведен в консоль согласно условиям задачи.
         */

        System.out.println("Задание 4");
        String fullName4 = "Ivanov Ivan Ivanovich";
        int ind1 = fullName4.indexOf(' ');
        int ind2 = fullName4.lastIndexOf(' ');

        String lastName4 = fullName4.substring(0,ind1);
        String firstName4 = fullName4.substring(ind1+1,ind2);
        String middleName4 = fullName4.substring(ind2+1);

        System.out.println("Имя сотрудника - " + firstName4);
        System.out.println("Фамилия сотрудника - " + lastName4);
        System.out.println("Отчество сотрудника - " + middleName4);

// Задание 5
        /*
        Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
Подсказка 1
Метод toCharArray() может быть полезен.
Подсказка 2
Для преобразования символа в верхний регистр следует использовать метод Character.toUpperCase(c), где c — символ.
Критерии оценки
– Применен метод, меняющий написание данных строки.
– При изменении содержания строки результат программы выполняется.
– Результат программы выведен в консоль согласно условиям задачи.
         */
        System.out.println("Задание 5");
        String fullName5 = "ivanov ivan ivanovich";
        char[] str = fullName5.toCharArray();
        for(int i = 0; i < str.length-1; i++){
            str[0]=Character.toUpperCase(str[0]);
            if(str[i]==' '){
                str[i+1]=Character.toUpperCase(str[i+1]);
            }
            System.out.print(str[i]);
        }

// Задание 6
        /*
        Имеется две строки.
Первая: "135"
Вторая: "246"
Соберите из двух строк одну, содержащую данные "123456".
Использовать сортировку нельзя.
Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
Выведите результат в консоль в формате: “Данные строки — ….”
Подсказка
Следует использовать StringBuilder.
Критерии оценки
– Применен метод, меняющий написание данных строки.
– При изменении содержания строки результат программы выполняется.
– Результат программы выведен в консоль согласно условиям задачи.
         */
        System.out.println('\n'+"Задание 6");
        StringBuilder str1 = new StringBuilder("1357");
        String str2 = "2468";
        char[] strNew = str2.toCharArray();
        int l = 1;
        for(int j = 0; j < strNew.length; j++){
            str1.insert(l,strNew[j]);
            l=l+2;
        }
        System.out.println(str1);

// Задание 7
        /*
        Дана строка из букв английского алфавита "aabccddefgghiijjkk".
Нужно найти и напечатать буквы, которые дублируются в строке.
Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
В итоге в консоль должен быть выведен результат программы: "acdgijk".
Критерии оценки
– Данные в строке отсортированы корректно.
– При изменении содержания строки результат программы выполняется.
– Результат программы выведен в консоль согласно условиям задачи.
         */
        System.out.println("Задание 7");
        String str3 = "aabccddefgghiijjkk";
        char[] arr = str3.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]);
                while (i < arr.length-1 && arr[i]==arr[i+1]){
                    i++;
                }
            }
        }

    }
}