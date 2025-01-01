package org.asd._19_12_2024;

public class E3 {
    /**
     *
     * 1. Создайте класс "Category" с полями:
     *    - id (уникальный идентификатор категории, тип int)
     *    - name (название категории, тип String)
     *    - description (описание категории, тип String)
     *
     *    Добавьте:
     *    - Конструктор по умолчанию
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для каждого поля
     *    - Метод toString для представления объекта в строковом виде
     *
     * 2. Расширьте класс "Product":
     *    - Добавьте поле category (объект класса Category)
     *    - Добавьте поле discount (размер скидки, тип double)
     *    - Добавьте метод calculateFinalPrice(), который возвращает цену продукта с учётом скидки.
     *
     * 3. Создайте класс "Address" с полями:
     *    - street (улица, тип String)
     *    - city (город, тип String)
     *    - postalCode (почтовый индекс, тип String)
     *    - country (страна, тип String)
     *
     *    Добавьте:
     *    - Конструктор по умолчанию
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для каждого поля
     *    - Метод toString для представления объекта в строковом виде
     *
     * 4. Расширьте класс "Customer":
     *    - Добавьте поле addresses (список объектов Address)
     *    - Добавьте метод addAddress(Address address) для добавления нового адреса.
     *
     * 5. Создайте класс "OrderStatus" с полями:
     *    - id (уникальный идентификатор статуса, тип int)
     *    - status (статус заказа, тип String, например "Processing", "Shipped", "Delivered")
     *    - updateDate (дата последнего обновления статуса, тип LocalDate)
     *
     *    Добавьте:
     *    - Конструктор по умолчанию
     *    - Конструктор с параметрами для всех полей
     *    - Геттеры и сеттеры для каждого поля
     *    - Метод toString для представления объекта в строковом виде
     *
     * 6. Расширьте класс "Order":
     *    - Добавьте поле status (объект класса OrderStatus)
     *    - Добавьте поле orderDate (дата заказа, тип LocalDate)
     *    - Добавьте метод calculateTotalAmount(), который пересчитывает общую сумму заказа с учётом скидок на продукты.
     *
     * 7. В основном классе:
     *    - Создайте несколько объектов "Category", "Product", "Customer", "Address", "OrderStatus" и "Order".
     *    - Реализуйте сценарий, где создаётся заказ с несколькими продуктами, устанавливается статус, добавляются адреса клиента.
     *    - Выведите в консоль подробную информацию о заказе, включая финальную стоимость и статус.
     */

}