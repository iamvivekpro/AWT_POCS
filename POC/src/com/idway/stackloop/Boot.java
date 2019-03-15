package com.idway.stackloop;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Vector;
import java.awt.Toolkit;

public class Boot{
	long countTime=0;
	private FontMetrics fontMetrics;
	Font f1 = new Font("DV-OTSitaraLight" , Font.PLAIN , 20);
	Frame f;
	Graphics2D g;
	int yAxix=0;
	public Boot() {
		f = new Frame();
		f.setBounds(0, 0, 1280, 720);
		f.setVisible(true);
		f.setBackground(Color.BLACK);
		f.setLayout(null);
		g = (Graphics2D) f.getGraphics();
	}
	public void disp() {	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		g.setColor(new Color(255,255,255,140));
		g.setFont(f1);
		String ArrHindi[]= {
				"कश्मीरी दम आलू",
				"Harpal Singh Sokhi",
				"भारत के मशहूर शेफ़",
				"Ingredients",
					"4 लोगो के लिए ",
					"20 छोटे आलू, छिले हुए",
					"2 1/4 छोटे चम्मच नमक",
					"1 क्वार्ट (800 मि.ली.) वनस्पति तेल",
					"5 कश्मीरी लाल मिर्च, पिसी हुई",
					"2 कप दही",
					"1/2 छोटा चम्मच छोटी इलायची पाउडर",
					"1 छोटा चम्मच सौंठ",
					"2 बड़े चम्मच सौंफ पाउडर",
					"1/4 कप छना हुआ सरसों का तेल",
					"एक बड़ी चुटकी लौंग पाउडर",
					"एक चुटकी हींग",
					"1/2 छोटा चम्मच भुना हुआ जीरा पाउडर",
					"1/2 छोटा चम्मच गरम मसाला पाउडर",
				"Ingredients",
				"Method",
					"आलुओं को चलते हुए पानी में अच्छे से रगड़ लें। फिर उन्हें चारों ओर से एक काँटे से गोंद दें।",
					"अब एक गहरे कटोरे में दो कप (400 मि.ली.) पानी डालकर उसमें एक छोटा चम्मच नमक मिला दें। फिर उसमें आलुओं को पंद्रह मिनट के लिए भिगो दें। फिर उसे निकालकर सुखा लें।",
					"अब एक पॅन को तेज आँच पर रखें और उसमें तेल डाल दें। जब पॅन की तली पर छोटे-छोटे बुलबुले दिखाई देने लगें, तब आँच को मध्यम कर दें और उसमें आलू डालकर उसे दस मिनट या आलू के सुनहरा भूरा होने तक पकाएँ।",
					"अब आलू को झंझरी (झारी) से एक सोखने वाले पेपर पर निकाल लें और फिर उसे अलग रख दें। अब कश्मीरी लाल मिर्च को आधा कप (100 मि.ली.) पानी में 15 मिनट के लिए भिगो दें। फिर उसे निकालकर एक मिक्सी में डाल दें और उसे दो बड़े चम्मच (30 मि.ली.) पानी के साथ पीसकर बारीक पेस्ट तैयार कर लें।",
					"एक कटोरे में दही ले लें, फिर उसमें कश्मीरी लाल मिर्च का पेस्ट, छोटी इलायची पाउडर, सौंठ और सौंफ पाउडर डालकर उसे अच्छे से फेंट लें।",
					"अब एक गहरे नॉन स्टिक पॅन को मध्यम आँच पर रखें और उसमें सरसों का तेल डाल दें। फिर उसमें लौंग पाउडर और हींग डाल दें। अब उसमें आधा कप (100 मि.ली.) पानी व बचा हुआ नमक डालकर मिश्रण को उबाल लें।",
					"अब उसमें दही का मिश्रण मिलाकर उसे दोबारा उबाल लें। फिर उसमें तले हुए आलू डालें और उसे 12 मिनट या आलू के ग्रेवी में अच्छे से मिलने और तेल के ऊपर आने तक पकाएँ।",
					"अब उसे भुने हुए जीरा पाउडर और गरम मसाला पाउडर से सजाकर गरमा गरम पेश करें।",
					"नुस्खा : आलू को गोंदकर तलने के बाद वे काफी हल्के हो जाते है। अगर वे हल्के न हो, इसका मतलब है कि आलू में सही तरीके से गोंदा नहीं गया है।",
					"इसीलिए एक बार एक आलू को तलकर देख लेना चाहिए। आलू का आकार भी इस रेसिपी में काफी महत्वपूर्ण है। आलू का आकार छोटा होना चाहिए, लेकिन बहुत छोटा नहीं।",	
		};
		
		String ArrEnglish[]= {"Kashmiri Dum Aloo",
							"Harpal Singh Sokhi",
							"Renowned Chef of India",
							"Makes 4 servings:",
							"20 small potatoes, peeled",
							"2 1/4 tsp table salt",
							"1 quart vegetable oil",
							
							"5 Kashmiri red chillies, ground",
							"2 cups plain yogurt",
							"1/2 tsp green cardamom powder",
							"1 tsp dried ginger powder (soonth)",
							"2 tbsp fennel (saunf) powder",
							"1/4 cup filtered mustard oil",
							"A generous pinch of clove powder",
							"A pinch of asafoetida",
							"1/2 tsp roasted cumin powder",
							"1/2 tsp garam masala powder",
							"Ingredients",
							"Method",
							"Scrub the potatoes well under running water. Prick them all over with a fork",
							"Add 1 tsp salt to 2 cups (400 ml) water in a deep bowl and keep the potatoes soaked in this for 15 minutes. Drain and wipe dry",
							"Keep a wok on high heat and pour in the oil. When small bubbles appear at the bottom of the pan, reduce heat to medium, add the potatoes and cook for 10 minutes or until the potatoes are golden brown.",
							"Drain with a slotted spoon and place them on an absorbent paper and set aside. Soak the Kashmiri red chillies in 1/2 cup (100 ml) water for 15 minutes. Drain and place them in a blender jar and blend to a fine paste with 2 tbsp (30 ml) water.",
							"Place the yogurt in a bowl, add the Kashmiri red chilli paste, green cardamom powder, dried ginger powder and fennel powder and whisk till well blended.",
							"Place a deep non stick pan on medium heat and pour in the mustard oil in a pan. Add the clove powder and asafoetida. Add 1/2 cup (100 ml) water and the remaining salt and bring the mixture to a boil.",
							"Stir in the yogurt mixture and bring the mixture to a boil again. Add the browned potatoes and cook for 12 minutes or till the potatoes absorb the gravy and the oil surfaces.",
							" Garnish with roasted cumin powder and garam masala powder and serve hot.",
							"Chef's tip: The process of pricking the potatoes makes them very light when fried. If they are not light, it means the pricking has not been proper or sufficient.",
							"Therefore it is a good idea to fry one potato and check. The size of the potato is also important, it should be of small size but should not be very small."		
					};
		long t1=System.currentTimeMillis();
		
		for(int i=0;i<ArrEnglish.length;i++) {
			wrapText(ArrEnglish[i], 200);
		}
//				g.drawString(Arrays.toString(wrapText(ArrEnglish[i], 200)).replace('[', ' ').replace(']',' '), 20,20 + i*20);
//		}
		long t2=System.currentTimeMillis();
		System.out.println("\t\tRendering Time for English is ="+(t2-t1));
		int i=0;
		long t3=System.currentTimeMillis();
		for(int j=0;j<ArrHindi.length;j++) {
			wrapText(ArrHindi[j], 200);
			//g.drawString(Arrays.toString(wrapText(ArrHindi[j], 200)).replace('[', ' ').replace(']',' '), 20,20 + i*20);
			
		}
		long t4=System.currentTimeMillis();
		System.out.println("\t\tRendering Time for Hindi is ="+(t4-t3));	
	}
	public int  charWidth(char ch) {
		if (fontMetrics == null) {	
			fontMetrics = Toolkit.getDefaultToolkit().getFontMetrics(f1);
		}
		return fontMetrics.charWidth(ch);
	}
	public int  stringWidth(String str) {
		if (fontMetrics == null) {
			fontMetrics = Toolkit.getDefaultToolkit().getFontMetrics(f1);
		}
		int stringWidth = fontMetrics.stringWidth(str);
		return stringWidth;
	}
	public  String [] wrapText (String text,int len){
		int SCREEN=0,TXT_REC_LIST=1,CACHK=2,TUNEBACK=3,FULLSCREEN=4,CAPOPUP=5,HELP=6,VIDEOREC=7,TIPS=8,TXTREC=9,CONTEST=10,UGC=11,PROMO=12,VIDREC_LOADING=13;
		if (text == null)  return new String [] {};
		if (len <= 0)  return new String [] {text};  
		char [] chars = text.toCharArray();  
		Vector lines = new Vector();  
		StringBuffer line = new StringBuffer();  
		StringBuffer word = new StringBuffer();
		int wordLength = 0;
		int lineLength = 0;
		try{
			for (int i = 0; ; i++) {
				if(chars[i]!= '#' ||chars[i]==' '){
					word.append(chars[i]);
					wordLength += charWidth(chars[i]);
				}
				if (chars[i] == ' ' || chars[i] == ','  ||chars[i] == '#') {  
					if ( ((lineLength + wordLength) > len) ||chars[i] == '#') {
						if(lineLength>0){
							lines.addElement(line.toString());
							line.delete(0, line.length()); 
							lineLength = 0;
						}
					}   
					line.append(word.toString());  
					lineLength += wordLength;
					word.delete(0, word.length());
					wordLength = 0;
				}  
			}
		}catch(Exception e){}
		if (word.length() > 0) {    
			if (stringWidth((line.toString() + word.toString())) > len) {
				if(line.toString().length()>0){
					lines.addElement(line.toString());  
					line.delete(0, line.length()); 
				}
			}    System.out.println();
			line.append(word.toString());  
		}  
		if (line.length() > 0) {    
			lines.addElement(line.toString());  
		}  
		String [] ret = new String[lines.size()];  
		int c = 0; 
		for (Enumeration e = lines.elements(); 
		e.hasMoreElements(); c++) {    
			ret[c] = (String) e.nextElement(); 
			g.drawString(ret[c],30,10*yAxix+20);
			yAxix+=2;
			//System.out.println(ret[c]);
		}  
		long t2=System.currentTimeMillis();
		
		return ret;
	}

    public final static void main(String[] args) throws Exception {
    	Boot ob = new Boot();
    	ob.disp();
    }
}
    
