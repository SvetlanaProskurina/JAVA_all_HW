public interface VendingAutomat {
  abstract void goodsDelivery(); //Выдача продукта
  abstract void moneyAccept(); // прием денег
  abstract void change(); // выдача сдачи
}
