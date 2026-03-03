class TV{
  int tamanho;
  int volume = 5; 
  String marca;
  int voltage; 
  int canal;

  int aumentar volume (){
      if (volume < 10){
    volume ++;
  }
  return volume;
  }
}
