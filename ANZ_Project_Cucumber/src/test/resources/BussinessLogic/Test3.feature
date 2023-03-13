Feature: returns the message 

  Background: user is to able open application
    When user open "Chrome" browser with exe "./Drivers\\msedgedriver.exe"
    When user enter url as "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"


  Scenario: returns the message functionality
    When user enter "1" as a Living expenses
    When user click on work out how much I can borrow
    Then return the message "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 100 641.”
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    