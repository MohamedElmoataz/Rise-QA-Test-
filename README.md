# Rise-QA-Test-
Since the task is simple, I  used only one class and method.
After preparing the environment and downloaded the jar file for the selenium from the main site. and also downloaded the chromeDriver.

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe"); here I set the property for it tto use it.
        WebDriver driver = new ChromeDriver();
driver.get("https://www.saucedemo.com/"); Here is where you open thewebsite 

now the time to take the username and password as inputs
Scanner UserName = new Scanner(System.in);
        String UN;
        Scanner Password = new Scanner(System.in);
        String Pass; 
        System.out.println("Please Enter The User Name");
        UN = UserName.nextLine();
        System.out.println("Please Enter The Password");
        Pass = Password.nextLine();
        
        Now here I sent the values to the fields and clicked on login 
          driver.findElement(By.name("user-name")).sendKeys(UN);
            driver.findElement(By.name("password")).sendKeys(Pass);
            driver.findElement(By.name("login-button")).click();
            
            
            Here I selected random three items from the website
              driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();

        
        
