import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;


public class PoliticalSurvey {

    public static void main(String[] args){
        //Survey title
        System.out.println();
        System.out.println("*---- Political Views Survey ----*");
        System.out.println();

        //Create scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Create answer option for comparison
        String userAnswer = "";

        //party names array
        String[] party = {"Democrat", "Republican", "Libertarian", "Green Party"};

        //results array
        ArrayList<String> results = new ArrayList<String>();
        
        //Create party variables
        int Rep = 0;
        int Dem = 0;
        int Lib = 0;
        int Green = 0;


        // Ask the user question 1 and add their answer to the data instance
         System.out.println("What should the government do to help the poor?");
         System.out.println("A. Make it easier to apply for assistance.");
         System.out.println("B. Allow parents to use education funds for charter schools.");
         System.out.println("C. Create welfare to work programs.");
         System.out.println("D. Nothing.");
         System.out.print("Selection: ");
         userAnswer = scanner.nextLine().toUpperCase();
         results.add(userAnswer);
         System.out.println();
            switch (userAnswer){
                case "A":
                Dem++;
                break;
                case "B":
                Rep++;
                break;
                case "C":
                Lib++;
                break;
                case "D":
                Green++;
                break;
                default:
                break;
            }


             // Ask the user question 2 and add their answer to the data instance
         System.out.println("What is your stance on government intervention?");
         System.out.println("A. Government interventions should address inequality and regulate industries.");
         System.out.println("B. Limited government interventions should promote free markets.");
         System.out.println("C. Minimal government interventions should favor individual liberty.");
         System.out.println("D. Government interventions should promote environmental sustainability and social justice.");
         System.out.print("Selection: ");
         userAnswer = scanner.nextLine().toUpperCase();
         results.add(userAnswer);
         System.out.println();
            switch (userAnswer){
                case "A":
                Dem++;
                break;
                case "B":
                Rep++;
                break;
                case "C":
                Lib++;
                break;
                case "D":
                Green++;
                break;
                default:
                break;
            }

             // Ask the user question 3 and add their answer to the data instance
         System.out.println("How do you feel about individual rights and civil liberties?");
         System.out.println("A. Emphasis on protecting civil rights and promoting social equality.");
         System.out.println("B. Support for traditional values and limited government involvement in personal matters.");
         System.out.println("C. Strong emphasis on personal freedom and limited government interference in all aspects.");
         System.out.println("D. Focus on personal and environmental rights, advocating for social justice.");
         System.out.print("Selection: ");
         userAnswer = scanner.nextLine().toUpperCase();
         results.add(userAnswer);
         System.out.println();
            switch (userAnswer){
                case "A":
                Dem++;
                break;
                case "B":
                Rep++;
                break;
                case "C":
                Lib++;
                break;
                case "D":
                Green++;
                break;
                default:
                break;
            }

             // Ask the user question 4 and add their answer to the data instance
         System.out.println("What is your opinion on healthcare policy?");
         System.out.println("A. Advocacy for universal healthcare and increased government regulation.");
         System.out.println("B. Support for market-based healthcare solutions and reduced government involvement.");
         System.out.println("C. Favoring free-market competition in healthcare and limited government intervention.");
         System.out.println("D. Pushing for a single-payer, comprehensive healthcare system.");
         System.out.print("Selection: ");
         userAnswer = scanner.nextLine().toUpperCase();
         results.add(userAnswer);
         System.out.println();
            switch (userAnswer){
                case "A":
                Dem++;
                break;
                case "B":
                Rep++;
                break;
                case "C":
                Lib++;
                break;
                case "D":
                Green++;
                break;
                default:
                break;
            }

             // Ask the user question 5 and add their answer to the data instance
         System.out.println("How should the government approach environmental issues?");
         System.out.println("A. Active role in addressing climate change and promoting renewable energy.");
         System.out.println("B. Balanced approach, considering economic impacts while promoting energy independence.");
         System.out.println("C. Minimal government involvement, allowing market forces to drive environmental solutions.");
         System.out.println("D. Strong government action to combat climate change and protect natural resources.");
         System.out.print("Selection: ");
         userAnswer = scanner.nextLine().toUpperCase();
         results.add(userAnswer);
         System.out.println();
            switch (userAnswer){
                case "A":
                Dem++;
                break;
                case "B":
                Rep++;
                break;
                case "C":
                Lib++;
                break;
                case "D":
                Green++;
                break;
                default:
                break;
            }

             // Ask the user question 6 and add their answer to the data instance
         System.out.println("What's your view on taxation and government spending?");
         System.out.println("A. Support for lower taxes and reduced government spending.");
         System.out.println("B. Support for lower taxes and reduced government spending.");
         System.out.println("C. Minimal taxation and limited government spending, emphasizing personal financial responsibility.");
         System.out.println("D. Higher taxes to fund social and environmental initiatives.");
         System.out.print("Selection: ");
         userAnswer = scanner.nextLine().toUpperCase();
         results.add(userAnswer);
         System.out.println();
            switch (userAnswer){
                case "A":
                Dem++;
                break;
                case "B":
                Rep++;
                break;
                case "C":
                Lib++;
                break;
                case "D":
                Green++;
                break;
                default:
                break;
            }

             // Ask the user question 7 and add their answer to the data instance
         System.out.println("How should the criminal justice system be reformed?");
         System.out.println("A. Emphasis on criminal justice reform, addressing systemic inequalities.");
         System.out.println("B. Focus on law and order, with stricter penalties for crimes.");
         System.out.println("C. Support for minimal government involvement in criminal justice, emphasizing individual rights.");
         System.out.println("D. Advocacy for restorative justice and addressing root causes of crime.");
         System.out.print("Selection: ");
         userAnswer = scanner.nextLine().toUpperCase();
         results.add(userAnswer);
         System.out.println();
            switch (userAnswer){
                case "A":
                Dem++;
                break;
                case "B":
                Rep++;
                break;
                case "C":
                Lib++;
                break;
                case "D":
                Green++;
                break;
                default:
                break;
            }

             // Ask the user question 8 and add their answer to the data instance
         System.out.println("What's your stance on immigration and border control?");
         System.out.println("A.  Advocacy for comprehensive immigration reform and a pathway to citizenship.");
         System.out.println("B. Support for stricter border control and immigration policies.");
         System.out.println("C. Emphasis on open borders and minimal government interference in migration.");
         System.out.println("D. Focus on humanitarian treatment of immigrants and refugees.");
         System.out.print("Selection: ");
         userAnswer = scanner.nextLine().toUpperCase();
         results.add(userAnswer);
         System.out.println();
            switch (userAnswer){
                case "A":
                Dem++;
                break;
                case "B":
                Rep++;
                break;
                case "C":
                Lib++;
                break;
                case "D":
                Green++;
                break;
                default:
                break;
            }

            // Ask the user question 9 and add their answer to the data instance
         System.out.println("How should education be funded and managed?");
         System.out.println("A.  Advocacy for increased federal funding and standards in education.");
         System.out.println("B. Support for school choice and local control of education.");
         System.out.println("C. Favoring privatization and reduced government involvement in education.");
         System.out.println("D. Pushing for well-funded public education with an emphasis on holistic learning.");
         System.out.print("Selection: ");
         userAnswer = scanner.nextLine().toUpperCase();
         results.add(userAnswer);
         System.out.println();
            switch (userAnswer){
                case "A":
                Dem++;
                break;
                case "B":
                Rep++;
                break;
                case "C":
                Lib++;
                break;
                case "D":
                Green++;
                break;
                default:
                break;
            }

            // Ask the user question 10 and add their answer to the data instance
         System.out.println("What's your approach to international relations and military intervention?");
         System.out.println("A.  Diplomacy-focused approach and cautious stance on military intervention.");
         System.out.println("B. Emphasis on strong national defense and military intervention if necessary.");
         System.out.println("C. Avoidance of foreign entanglements and military intervention, promoting non-interventionism.");
         System.out.println("D. Preference for peaceful conflict resolution and international cooperation.");
         System.out.print("Selection: ");
         userAnswer = scanner.nextLine().toUpperCase();
         results.add(userAnswer);
         System.out.println();
            switch (userAnswer){
                case "A":
                Dem++;
                break;
                case "B":
                Rep++;
                break;
                case "C":
                Lib++;
                break;
                case "D":
                Green++;
                break;
                default:
                break;
            }

               // Ask the user question 11 and add their answer to the data instance
         System.out.println("What's your stance on corporate influence in politics and the economy?");
         System.out.println("A. While some regulation is necessary, I believe businesses play a vital role in driving economic growth and job creation.");
         System.out.println("B. I strongly advocate for reducing corporate influence in politics and the economy, focusing on fair and equitable distribution of resources.");
         System.out.print("Selection: ");
         userAnswer = scanner.nextLine().toUpperCase();
         results.add(userAnswer);
         System.out.println();
            switch (userAnswer){
                case "A":
                Dem++; 
                Rep++;
                break;
                case "B":
                Green++;
                break;
                default:
                break;
            }

            // Ask the user question 12 and add their answer to the data instance
         System.out.println("What's your stance on corporate influence in politics and the economy?");
         System.out.println("A. I believe in fostering a free-market system where individuals can earn and keep their wealth, which contributes to overall economic growth.");
         System.out.println("B. I support policies aimed at reducing income inequality through progressive taxation and wealth redistribution to ensure a more equitable society.");
         System.out.print("Selection: ");
         userAnswer = scanner.nextLine().toUpperCase();
         results.add(userAnswer);
         System.out.println();
            switch (userAnswer){
                case "A":
                Dem++; 
                Rep++;
                break;
                case "B":
                Green++;
                break;
                default:
                break;
            }

            // Ask the user question 13 and add their answer to the data instance
         System.out.println("How do you approach gun control and Second Amendment rights?");
         System.out.println("A. I support stricter gun control measures to reduce gun violence and ensure public safety.");
         System.out.println("B. I emphasize the importance of Second Amendment rights and believe in protecting individuals' right to own firearms.");
         System.out.print("Selection: ");
         userAnswer = scanner.nextLine().toUpperCase();
         results.add(userAnswer);
         System.out.println();
            switch (userAnswer){
                case "A":
                Dem++; 
                break;
                case "B":
                Rep++;
                break;
                default:
                break;
            }

            //guess the respondents party
            ArrayList<Integer> score = new ArrayList<Integer>();
            score.add(Dem);
            score.add(Rep);
            score.add(Lib);
            score.add(Green);
            int max = 0;
            int index = 0;
            for(int i = 0; i < 4; i++){
                if(score.get(i) > max){
                    max = score.get(i);
                    index = i;
                }

            }
            //Make prediction based on results
            String guess = party[index];
            System.out.println("------------Time to make a guess------------");
            System.out.println("Prediction: " + guess);
            System.out.println();

               // Ask the user their party
                System.out.println("What political party do you identify with?");
                System.out.println("A. Democrat.");
                System.out.println("B. Republican.");
                System.out.println("C. Libertarian.");
                System.out.println("D. Green.");
                System.out.print("Selection: ");
                userAnswer = scanner.nextLine().toUpperCase();
                results.add(userAnswer);
                System.out.println();
                switch (userAnswer){
                    case "A":
                    Dem++;
                    break;
                    case "B":
                    Rep++;
                    break;
                    case "C":
                    Lib++;
                    break;
                    case "D":
                    Green++;
                    break;
                    default:
                    break;
                } 
                System.out.println("Thank you for completing the survey!"); 
                System.out.println();

            //data to write to text file 
            String ans = results.toString(); 
            
            //create text files
            try {
                File f1 = new File("Democrat.txt");
                if(!f1.exists()) {
                   f1.createNewFile();
                }
                File f2 = new File("Republican.txt");
                if(!f2.exists()) {
                   f2.createNewFile();
                }
                File f3 = new File("Libertarian.txt");
                if(!f3.exists()) {
                   f3.createNewFile();
                }
                File f4 = new File("Green.txt");
                if(!f4.exists()) {
                   f4.createNewFile();
                }
             //write results to correct file
                switch (results.get(results.size() - 1)) {
                    case "A":
                        FileWriter fileWriter1 = new FileWriter(f1.getName(),true);
                        BufferedWriter bw1 = new BufferedWriter(fileWriter1);
                        bw1.write(ans);
                        bw1.newLine();
                        bw1.close();
                        break;
                    case "B":
                        FileWriter fileWriter2 = new FileWriter(f2.getName(),true);
                        BufferedWriter bw2 = new BufferedWriter(fileWriter2);
                        bw2.write(ans);
                        bw2.newLine();
                        bw2.close();
                        break;
                    case "C":
                        FileWriter fileWritter3 = new FileWriter(f3.getName(),true);
                        BufferedWriter bw3 = new BufferedWriter(fileWritter3);
                        bw3.write(ans);
                        bw3.newLine();
                        bw3.close();
                        break;
                    case "D":
                        FileWriter fileWritter4 = new FileWriter(f4.getName(),true);
                        BufferedWriter bw4 = new BufferedWriter(fileWritter4);
                        bw4.write(ans);
                        bw4.newLine();
                        bw4.close();
                        break;
                    default:
                        break;
                }
               
                System.out.println("Done");
             } catch(IOException e){
                e.printStackTrace();             
             }
             System.out.println("");
             scanner.close();
        } 
    }
