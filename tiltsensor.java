//Tilt Sensor for microcontroller 

int inPin = 7; 
int value;

void setup() 
{
  Serial.begin(9600);
  pinMode(inPin, INPUT);                // initializes digital pin 7 as input
}

void loop() 
{
  value = digitalRead(inPin); 
  if(digitalRead(inPin)==1){
  Serial.write(2);}
  else{
  Serial.write(3);           
  }
  delay(80);
}
