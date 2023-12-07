#include<iostream>
using namespace std;

class Student
{

public:
int roll_no;
string name;
Student(int roll_no,string name){
  this->roll_no=roll_no;
  this->name=name;
}
};

int main(){
  Student student[3]={Student(1,"vijay"),Student(2,"kanth"),Student(3,"chennupati")};
  for (int i=0;i<size(student);i++){
  cout << student[i].roll_no<<" "<<student[i].name<<"\n";
  }
  return 0;
}