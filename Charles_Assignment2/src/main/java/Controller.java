/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vvard
 */
public class Controller {
    View v = new View();
    Algorithms a = new Algorithms();
    
    public void go(){
        boolean cont = true;
        
        do{
            intro();
            chooseAlgorithm(v.inInt());
            
        }
        while(cont = true);
        
        
        
    }

    private void intro() {
        v.welcome();
    }

    private void chooseAlgorithm(int inInt) {
        switch (inInt){
                case 1:
                    a.a1();
                    break;
                case 2:
                    a.a2();
                    break;
                case 3:
                    a.a3();
                    break;
                case 4:
                    a.a4();
                    break;
                case 5:
                    a.a5();
                    break;
                case 6:
                    a.a6();
                    break;
                case 999:
                    v.bye();
                    break;
        }
    
    }

}
