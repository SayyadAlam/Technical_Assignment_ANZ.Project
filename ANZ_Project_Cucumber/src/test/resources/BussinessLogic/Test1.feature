Feature: Entering information

  Background: user is able open application
    When user open "Chrome" browser with exe "./Drivers\\msedgedriver.exe"
    When user enter url as "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/"

  Scenario: Enter correct information of user
    When user click on Single Application type
    When user select 0as Number of dependants
    When user click on Home to live ins
    When user enter "80000" as a Your annual income
    When user enter "10000" as a Your annual other income
    When user enter "500" as a Monthly living expenses
    When user enter "0" as a Current home loan monthly repayments
    When user enter "100" as a Other loan monthly repayments
    When user enter "0" as a Other monthly commitments
    When user enter "10000" as a Total credit card limits
    When user click on work out how much I can borrow
    Then application shows estimated value $479,000.
     
    
    
    
    
    
    
    
    
    
