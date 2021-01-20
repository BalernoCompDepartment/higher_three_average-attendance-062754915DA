class Main {
  public static void main(String[] args) {
    
  // Step 1: set total initially to 0
  int total = 0;
    
  //Step 2: Start a fixed loop for 8 atttendances
  for (int loop =0; loop < 8; loop++){ 
  
    
  //Step 3: ask user for attendance
    int attendance = Keyboard.getInt("Please enter the amount of attendees.");
    
  //Step 4: add value of attendance to total
    total = total + attendance;
    
  //Step 5: End fixed loop
  }
  //Step 6: Round average and convert to integer
  double average = (double)total / 8;
  int averageRounded = (int) Math.round(average);
  
    
  //Step 7: display the "Average cricket attendance is " concantenated with the calue of the average and followed by " this year"\
  Screen.display("Average cricket attendance is " + averageRounded + " this year.", "Attendance");
  }
}
