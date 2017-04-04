package pack;/*Пакет (package) — это некий контейнер, который используется для того, чтобы изолировать имена классов. 
pack - название пакета */

import java.awt.*;
import java.awt.event.*;
/*	java. - Все стандартные классы, поставляемые с системой Java, хранятся в пакете java.
java.awt  - подключение пакета awt, содержащего базовые графические функции:GridLayout, BorderLayout и т.д.
"*"-включение всех элементов библиотеки awt */	
import javax.swing.*;
/*	Импортируем: 
javax.* — стандартные расширения.(Стандартные расширения (standard extensions) — это пакеты или наборы пакетов Java)
Swing - Библиотека графического интерфейса (конкретный пакет), В отличие от java.awt, javax.swing имеет более гибкую 
систему управления и более широкий набор функций
"*"-включение всех элементов библиотеки Swing (jbutton,jpanel,jlabel и т.д.)
"."(точка) используется для выделения элементов из ссылки на объект.
*/
import javax.swing.border.*;//библиотека необходимая для того, чтобы установить отступы

public class index extends JFrame{
	/*	(Public) - поля и методы класса Index доступны для всех других объектов и классов. 
	зарезервированное слово class - говорит транслятору, что мы собираемся описать новый класс Index.
	Класс наследует функции элемента JFrame, который определён в стандартной библиотеке awt.
	 JFrame - само окно. JFrame содержит в себе всё необходимое для создания и функционирования окна программы - мы 
	 используем его методы в своей программе. { }-описание класса располагается между фигурными скобками. 
	*/

	private static final long serialVersionUID = 1L;
	public static index frame = new index(); /* Index() - это установка компонентов (панель вкладок) на JFrame. 
	(Public) - означает что фрейм Index можно вызвать из любого файла который лежит в пакете pack.
	static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
	отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
	и переменным можно обращаться через имя класса*/
	
	public static void main(String[] args) { /*  
		Модификатор доступа public означает, что метод main(String[] args)виден и доступен любому классу. 
		static позволяет определять статические методы. Это такие методы, которые являются общими для класса, а не для
		отдельного объекта этого класса. Также они могут работать лишь со статическими полями класса.К статическим методам 
		и переменным можно обращаться через имя класса.
		void означает, что метод main(String[] args)не возвращает данных в программу, которая его вызвала, 
		а просто выводит на экран строку.
		В методе main слова String[] args означают,что этот может получать массив объектов с типом String, т.е. текстовые данные.
		Программа может состоять из нескольких классов, но только один из них содержит метод main().
		Все существующие реализации Java-интерпретаторов, получив команду интерпретировать класс, 
		начинают свою работу с вызова метода main. 
		*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				/* public - модификатор доступа, означающий, что метод run() виден и доступен любому классу.
				void ()означает, что метод run не возвращает данных в программу, которая его вызвала, 
				а просто выводит на экран строку.
				Метод run с пустыми скобками, т.е. метод не имеет аргументов(параметров)	 
				*/
				try {
		/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
		Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
		Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
		1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
		доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
		 прерывается, и управление прыгает в начало блока catch(err).
		*/
					frame.setVisible(true); //устанавливаем что окно Index видно пользователю

				} catch (Exception e) {
					e.printStackTrace();
					/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
					Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
					Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
					1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
					доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
					 прерывается, и управление прыгает в начало блока catch(err).
					*/
				}
			}
		});
	}
	
	
	private JPanel panel;//панель на которых располагаются поля и кнопки. Панель доступна только для данного класса (private)
	private JButton del, calc;// кнопки Очистить и Рассчитать которые доступны только для данного класса
	private JLabel label_1,label_2,label_3,label_4, add,itog;
	// компонент на котором располагается текст
	public static JTextField resid,str,travel,transf,food,text_add_1,add_1, text_add_2, add_2, agen, disc;
	/* текстовые поля в которые пользователь вводит данные, доступны для любого файла из пакета pack */
	public static JCheckBox check_travel, check_transf, check_food, check_add, check_disc;// компонент флажок
	public static int int_travel=0, int_transf=0, int_food=0, int_add=0, int_disc=0;
	
	public index() { /*Модификатор доступа public означает, что метод Index()виден и доступен любому классу.
		static означает, что не нужно создавать экземпляр(копию) объекта Index в памяти, чтобы использовать этот метод.*/
		setTitle("Расчет стоимости тура"); //устанавливает название окна 
		setSize(475, 420); // указывает ширину и высоту.
		setLocationRelativeTo(null);//установить посередине экрана
		
		//по закрытию формы - закрывать приложение
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout (new BorderLayout()); /*	Оператор new создает экземпляр указанного класса
	  	Метод setLayout - Вызов менеджера компоновки, который задает определенный порядок панелей в контейнере.
 		Менеджер размещения BorderLayout - тип разбивки контейнера, при котором всё пространство контейнера разбивается 
 		на пять частей. В каждой из этих частей располагается один компонент. 
 		При добавлении компонента на контейнер с BorderLayout разработчик обязательно указывает, 
 		куда именно он хочет поместить компонент.*/

        panel = new JPanel();//Панель на которой  располагаются текстовые поля и поля для ввода текста, кнопки
		add(panel, BorderLayout.CENTER);//Добавление панели panel по центру
		panel.setBorder(new EmptyBorder(10,10,10,10));//установка внутренних отступов(сверху,слева,снизу,справа)
	
		/* установка менеджера компоновки GridLayout. данный менеджер компоновки располагает компоненты в 
		 * таблицу */
		panel.setLayout(new GridLayout(12,2,10,2));/* на панели 12 строк,2столбца,10 - расстояние между столбцами, 
		 2- между строками  */

		label_1 = new JLabel("Проживание, руб:", JLabel.LEFT);
		label_2 = new JLabel("Страховка, руб:", JLabel.LEFT);
		label_3 = new JLabel("Комиссия турагентства, %:", JLabel.LEFT);
		label_4 = new JLabel("ИТОГО стоимость тура, руб:", JLabel.RIGHT);
		add = new JLabel("", JLabel.CENTER);
		itog = new JLabel("", JLabel.CENTER);
		/*Обозначаем что переменные Label_1,Label_2..являются объектом JLabel и указываем какой текст будет выводиться.
		JLabel.LEFT - выравнивание по левому краю,
		JLabel.CENTER - выравнивание по центру
		*/
		label_4.setForeground(Color.RED); 
		itog.setForeground(Color.RED); 
		
		calc = new JButton("Рассчитать"); //В скобках - надпись на кнопке
		del = new JButton("Очистить"); 
	
		resid = new JTextField(); 
		str = new JTextField(); 
		travel = new JTextField(); 
		transf = new JTextField(); 
		food = new JTextField(); 
		text_add_1 = new JTextField(); 
		text_add_2 = new JTextField(); 
		add_1 = new JTextField(); 
		add_2 = new JTextField(); 
		agen = new JTextField("10"); 
		disc = new JTextField(); 

		//выравнивание текста по центру
		resid.setHorizontalAlignment(JTextField.CENTER); 
		str.setHorizontalAlignment(JTextField.CENTER); 
		travel.setHorizontalAlignment(JTextField.CENTER); 
		transf.setHorizontalAlignment(JTextField.CENTER); 
		food.setHorizontalAlignment(JTextField.CENTER); 
		text_add_1.setHorizontalAlignment(JTextField.CENTER); 
		text_add_2.setHorizontalAlignment(JTextField.CENTER); 
		add_1.setHorizontalAlignment(JTextField.CENTER); 
		add_2.setHorizontalAlignment(JTextField.CENTER); 
		agen.setHorizontalAlignment(JTextField.CENTER); 
		disc.setHorizontalAlignment(JTextField.CENTER);	
		
		//установка внутренних отступов для текстового поля (2-верхний отступ, 5-левый, 2-нижний, 5-правый)
		resid.setMargin(new Insets(2, 5, 2, 5));
		str.setMargin(new Insets(2, 5, 2, 5));
		travel.setMargin(new Insets(2, 5, 2, 5));
		travel.setMargin(new Insets(2, 5, 2, 5));
		food.setMargin(new Insets(2, 5, 2, 5));
		text_add_1.setMargin(new Insets(2, 5, 2, 5));
		text_add_2.setMargin(new Insets(2, 5, 2, 5));
		add_1.setMargin(new Insets(2, 5, 2, 5));
		add_2.setMargin(new Insets(2, 5, 2, 5));
		agen.setMargin(new Insets(2, 5, 2, 5));
		disc.setMargin(new Insets(2, 5, 2, 5));

		//компонент флажок 
		check_travel = new JCheckBox("Проезд (авиа/автобус/жд), руб:");
		check_transf = new JCheckBox("Трансфер, руб:");
		check_food = new JCheckBox("Питание, руб:");
		check_add = new JCheckBox("Дополнительные услуги");
		check_disc = new JCheckBox("Скидка, %:");

		
		//Добавление компонентов JCheckBox, JLabel, JTextField на панель panel
		panel.add(label_1);
		panel.add(resid);
		panel.add(label_2);
		panel.add(str);
		panel.add(check_travel);
		panel.add(travel);
		panel.add(check_transf);
		panel.add(transf);
		panel.add(check_food);
		panel.add(food);
		panel.add(check_add);
		panel.add(add);
		panel.add(text_add_1);
		panel.add(add_1);
		panel.add(text_add_2);
		panel.add(add_2);
		panel.add(label_3);
		panel.add(agen);
		panel.add(check_disc);
		panel.add(disc);
		panel.add(label_4);
		panel.add(itog);
		panel.add(del);
		panel.add(calc);
		//Добавление компонентов JLabel, JTextField на панель panel

		travel.setEditable(false);
		transf.setEditable(false);
		food.setEditable(false);
		text_add_1.setEditable(false);
		add_1.setEditable(false);
		text_add_2.setEditable(false);
		add_2.setEditable(false);
		disc.setEditable(false);
		check_travel.setForeground(Color.GRAY); 
		check_transf.setForeground(Color.GRAY); 
		check_food.setForeground(Color.GRAY); 
		check_add.setForeground(Color.GRAY); 
		check_disc.setForeground(Color.GRAY); 

/*ПРОЕЗД*/
		check_travel.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==check_travel)//если событие произошло именно с флажком check_travel, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это означает что проезд включается в стоимость тура  */
						int_travel=1; //переменная которая отвечает за то проезд включается в стоимость тура
						travel.setEditable(true);
						check_travel.setForeground(Color.BLACK); 

						}
					else { //если флажок выключен
						int_travel=0; //переменная которая отвечает за то проезд включается в стоимость тура
						travel.setEditable(false);
						check_travel.setForeground(Color.GRAY); 

					}
			}                                                       
    	   }); 	

/*ТРАНСФЕР*/
		check_transf.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==check_transf)//если событие произошло именно с флажком check_transf, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это означает что трансфер включается в стоимость тура  */
						int_transf=1; //переменная которая отвечает за то трансфер включается в стоимость тура
						transf.setEditable(true);
						check_transf.setForeground(Color.BLACK); 
						}
					else { //если флажок выключен
						int_transf=0; //переменная которая отвечает за то трансфер включается в стоимость тура
						transf.setEditable(false);
						check_transf.setForeground(Color.GRAY); 
					}
			}                                                       
    	   }); 	
		
/*ПИТАНИЕ*/
		check_food.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==check_food)//если событие произошло именно с флажком check_food, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это означает что питание включается в стоимость тура  */
						int_food=1; //переменная которая отвечает за то питание включается в стоимость тура
						food.setEditable(true);
						check_food.setForeground(Color.BLACK); 

						}
					else { //если флажок выключен
						int_food=0; //переменная которая отвечает за то питание включается в стоимость тура
						food.setEditable(false);
						check_food.setForeground(Color.GRAY); 

					}
			}                                                       
    	   }); 	
		
/*ДОПОЛНИТЕЛЬНЫЕ УСЛУГИ*/
		check_add.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==check_add)//если событие произошло именно с флажком check_add, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это означает что дололнит.услуги включаются в стоимость тура  */
						int_add=1; //переменная которая отвечает за то дололнит.услуги включается в стоимость тура
						check_add.setForeground(Color.BLACK); 
						text_add_1.setEditable(true);
						add_1.setEditable(true);
						text_add_2.setEditable(true);
						add_2.setEditable(true);
						}
					else { //если флажок выключен
						int_add=0; //переменная которая отвечает за то дололнит.услуги включается в стоимость тура
						check_add.setForeground(Color.GRAY); 
						text_add_1.setEditable(false);
						add_1.setEditable(false);
						text_add_2.setEditable(false);
						add_2.setEditable(false);
					}
			}                                                       
    	   }); 
/*СКИДКА*/
		check_disc.addItemListener(new ItemListener(){   /*Для компонента флажок устанавливаем слушатель события                                                        
			Если нажать на компонент - сработает проверка выбран флажок или снят */                                                     
			public void itemStateChanged(ItemEvent e) 
			/*. В теле метода itemStateChanged располагается код, который выполняется при смене состояния флажка. */
			{
				if (e.getSource()==check_disc)//если событие произошло именно с флажком check_disc, то выполняется следующее
					if(e.getStateChange()==1){ /* Если данный компонент флажок включен (==1), то это означает что турагенство предоставляет скидку */
						int_disc=1; //переменная которая отвечает за то что турагенство предоставляет скидку
						disc.setEditable(true);
						check_disc.setForeground(Color.BLACK); 
						}
					else { //если флажок выключен
						int_disc=0; //переменная которая отвечает за то что турагенство предоставляет скидку
						disc.setEditable(false);
						check_disc.setForeground(Color.GRAY); 
					}
			}                                                       
    	   }); 	
		
		calc.addActionListener(new ActionListener()   
    			/* 	calc - кнопка Рассчитать 
    	 		"."  - указывает к какой переменной (кнопке) следует применить слушателя.
    	 		addActionListener - добавление слушателя ActionListener к кнопке
    	  		new - Оператор new создает экземпляр указанного класса 
    	  		(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
    	  		который будет отвечать за реагирование на события. 
    	  		В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
    	  		Поэтому будет использоваться интерфейс "ActionListener", 
    	  		предназначенный для обработки событий "ActionEvent".
    	  		тело интерфейса указывается ниже после фигурной скобки "{"
    	  		*/ 
    	   {                                                         
    	    public void actionPerformed(ActionEvent e)   
    	    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
      		который реализуется путем простого вызова обработчика событий ActionPerformed.
      		Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
      		Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
      	*/
    	    {  
	    		
    	    	if ((isValidInput(resid, "стоимость проживания"))
    	    		&&(isValidInput(str, "стоимость страховки"))
    	    		&&(isValidInput(agen, "комиссию турагенства"))) {
	    		/* if - оператор если. * isValidInput проверяет данные на правильность, т.е. 
		 		если в текстовые поля введены буквы или символы (текст, который невозможно преобразовать в цифры).
		   		Если введены некорректные данные, то выдает ошибку */	
    	    		int valid_travel=0,valid_transf=0,valid_food=0,valid_disc=0,valid_add=0;
    	    			if (int_travel==1){
    	    				if (isValidInput(travel, "стоимость проезда")){
    	    					valid_travel=1;
    	    				}
    	    			} else {valid_travel=1;}
    	    			if (int_transf==1){
    	    				if (isValidInput(transf, "стоимость трансферта")){
    	    					valid_transf=1;
    	    				}
    	    			}else {valid_transf=1;}
    	    			if (int_food==1){
    	    				if (isValidInput(food, "стоимость питания")){
    	    					valid_food=1;
    	    				}
    	    			}else {valid_food=1;}
    	    			if (int_disc==1){
    	    				if (isValidInput(disc, "размер скидки")){
    	    					valid_disc=1;
    	    				}
    	    			}else {valid_disc=1;}
    	    			if (int_add==1){
    	    				if ((isValidInput(add_1, "стоимость дополнительных услуг"))
    	    					&&(isValidInput(add_2, "стоимость дополнительных услуг")))
    	    				{
    	    					valid_add=1;
    	    				}
    	    			}else {valid_add=1;}
    	    		
    	    		if ((valid_travel==1)&&(valid_transf==1)&&(valid_food==1)&&(valid_disc==1)&&
    	    				(valid_add==1)){ //если все данные введены верно - производим расчет
    	    			if ((int_disc==1)&&(Double.parseDouble(disc.getText())>Double.parseDouble(agen.getText()))){ //если количество детей до 18 лет больше чем количество детей, parseInt - преобразование введенного текста в цифры
    		            	JDialog D=new JDialog();
    	                	JOptionPane.showMessageDialog(D, "Введите правильные данные! Скидка не может быть больше комиссии турагенства", "Ошибка", JOptionPane.WARNING_MESSAGE);
    	                	/* showMessageDialog Отображает модальный диалог с одной кнопкой, которая помечена текстом "Oшибка" (или его локальным эквивалентом). 
    		    			 Когда модальный диалог становится видимым, он блокирует пользовательский ввод в другие окна программы. 
    		    		 "Введите правильные данные!"  это сообщение отображаемые в диалоге
    		               */
    	                	disc.requestFocus();//ставит фокус на строчке disc
    		    			disc.setText(""); 
    		    			/* setText означает написать текст в текстовое поле. Между кавычками ничего нет, значит текстовое поле будет пустым
    				    	*/  
    		            } else {
    		            	double d_travel,d_transf, d_food, d_add_1,d_add_2,d_disc,d_add;
    	    	    		double d_resid= Double.parseDouble(resid.getText());
    	    	    		double d_str= Double.parseDouble(str.getText());
    	    	    		double d_agen= Double.parseDouble(agen.getText());
    	    	    		if (int_travel==1){
    	    	    			d_travel= Double.parseDouble(travel.getText());
    	    	    			} else {d_travel=0;}
    	    	    		if (int_transf==1){
    	    	    			d_transf= Double.parseDouble(transf.getText());
    	    	    			} else {d_transf=0;}
    	    	    		if (int_food==1){
    	    	    			d_food= Double.parseDouble(food.getText());
    	    	    			} else {d_food=0;}
    	    	    		if (int_add==1){
    	    	    			d_add_1= Double.parseDouble(add_1.getText());
    	    	    			d_add_2= Double.parseDouble(add_2.getText());
    	    	    		} else {
    	    	    			d_add_1=0;
    	    	    			d_add_2=0;}
    	    	    		if (int_disc==1){
    	    	    			d_disc= Double.parseDouble(disc.getText());
    	    	    			} else {d_disc=0;}
    	    	    		/* В переменную  записываются данные введеные пользователем в текстовое поле которое расположено в файле Index.
    	    	    		Преобразование данных в тип Double. */ 
    	    	    		
    	    	    		if (int_add==1){
        	    	    		d_add=d_add_1+d_add_2;
        	    	    		String s_add = String.format("%.2f", d_add);
            	    			add.setText(s_add); /* Записываем строковую переменную в поля Jlabel */
    	    	    		} else {d_add=0;}

    	    	    		double d_itog=(d_resid+d_str+d_travel+d_transf+d_food+d_add)*(1+(d_agen-d_disc)/100);
    	    	    		
        	    			String s_itog = String.format("%.2f", d_itog);
        	    			/* String - указываем что переменная будет иметь строковый тип,
        	    		     * s_add - название новой переменной,
        	    		     * String.format - преобразование переменной в строкой тип,
        	    		     	%.2f - указываем что переменная имеет тип Float, показываем 2 знака после запятой,
        	    		     	d_add - переменная типа double, которую надо преобразовать в строковый тип
        	    		     	 */
        	    			itog.setText(s_itog);

    		            }
    	    		}
    	    		
    	    	}
    	    	}   	    	                             
    	   });
		
//Слушатель для кнопки ОЧИСТИТЬ			
				del.addActionListener(new ActionListener(){    //добавляем слушателя события для кнопки 
					/*      "."  - указывает к какой переменной (кнопке) следует применить слушателя.
				 	addActionListener - добавление слушателя ActionListener к кнопке
				  	new - Оператор new создает экземпляр указанного класса 
				  	(Для того чтобы кнопки стали функциональными, каждой из них необходимо присвоить обработчик событий, 
				  	который будет отвечать за реагирование на события. 
				  	В нашем случае требуется идентифицировать событие нажатия кнопки – путем щелчка мышью. 
				  	Поэтому будет использоваться интерфейс "ActionListener", 
				  	предназначенный для обработки событий "ActionEvent".
				  	тело интерфейса указывается ниже после фигурной скобки "{"
		    	    */
		    	    public void actionPerformed(ActionEvent e) 
		    	    /* 	ActionListener" имеет метод "actionPerformed" объекта "ActionEvent", 
			      	который реализуется путем простого вызова обработчика событий ActionPerformed.
			      	Ключевое слово public означает, что метод actionPerformed() доступен для любого другого класса Java
			      	Ключевое слово void означает, что метод main() не возвращает данных в программу, которая его вызвала. 
			      	*/             
		    	    {   
				    	//	Обнуляем все поля, переменные, флажки ставим в состояние выключен
		    	    	resid.setText("");
		    	    	str.setText("");
		    	    	travel.setText("");
		    	    	transf.setText("");
		    	    	food.setText("");
		    	    	add.setText("");
		    	    	text_add_1.setText("");
		    	    	add_1.setText("");
		    	    	text_add_2.setText("");
		    	    	add_2.setText("");
		    	    	agen.setText("10");
		    	    	disc.setText("");
		    	    	itog.setText("");
				    	check_travel.setSelected(false);
				    	int_travel=0;
				    	check_transf.setSelected(false);
				    	int_transf=0;
				    	check_food.setSelected(false);
				    	int_food=0;
				    	check_add.setSelected(false);
				    	int_add=0;
				    	check_disc.setSelected(false);
				    	int_disc=0;
				    	check_transf.setSelected(false);
				    	int_transf=0;
		    	    }    	    	                                                        
		    	   });		
	}	

	//проверка данных, введенных пользователем
    public static boolean isValidInput(JTextField jtxt, String description) {
        JDialog D = new JDialog();
		//если был введен какой-либо текст
        if (jtxt.getText().trim().length() > 0) {
            //проверка на ввод только целого числа
            try { /* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
				Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
				Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
				1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
				доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
				 прерывается, и управление прыгает в начало блока catch(err).
				*/
                 double num = Double.parseDouble(jtxt.getText()); //попытка преобразовать текст в целое число      
                return true; //если все нормально - возвращаем true
            } catch (NumberFormatException e) {
            	/* Для задания блока программного кода, который требуется защитить от исключений, используется ключевое слово try. 
				Сразу же после try-блока помещается блок catch, задающий тип исключения которое вы хотите обрабатывать.
				Исключение – это проблемная ситуация, возникающая по мере выполнения кода программы. Работает она так:
				1.Выполняется код внутри блока try. 2.Если в нём ошибок нет, то блок catch(err) игнорируется, то есть выполнение 
				доходит до конца try и потом прыгает через catch. 3.Если в нём возникнет ошибка, то выполнение try на ней
				 прерывается, и управление прыгает в начало блока catch(err).
				*/
                //расположить курсор в текстовое поле, чтобы пользователь еще раз ввел число
                jtxt.requestFocus();
                jtxt.setText("");//очистить текстовое поле
                //предупреждение - неверный формат числа
                JOptionPane.showMessageDialog(D, "Вы должны ввести число!", "Ошибка", JOptionPane.WARNING_MESSAGE);
                return false;//ошибка - возвращаем false
            }
        } else {// если пользователь не ввели никаких данных
            //предупреждение, что нужно ввести данные
            JOptionPane.showMessageDialog(D, "Введите " + description, "Ошибка", JOptionPane.WARNING_MESSAGE);

            //расположить курсор в текстово окне, чтобы пользователь еще раз ввел число
            jtxt.requestFocus();
            jtxt.selectAll();//очистить текстовое поле

            //ошибка - возвращаем false
            return false;
        }
    }	
}
