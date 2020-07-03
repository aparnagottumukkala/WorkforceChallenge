# WorkforceChallenge
# Relationships between tables 
1. One to many relationship between shift and shift grouping 
2. Many to one relationship between shift grouping and shift group
3. Shift grouping table is intermediary table which will not be created during the implementation. Thus formed by joining shift and shift group by joining 
# Inserting data to table
1. Created two table shift and shift group and inserted data
# Assumptions
1. There might be many shifts for a day ranging for 24 hours and each shift will fall under a particular group  --> Solved
2. There might be particular or fixed groups in shiftGroup table and each new shift might fall under that category 
# Implementation description
1. Implemented the challenge using java springboot
2. Followed MVC model (the code has model, repository,Service,Controller)
3. Used inbuilt database which is H2
4. Request mapping : http://localhot:8080/shift/{shiftCode}
            Example: http://localhost:8080/shift/N?shiftGroupCode=FIRST
5. Created two tables and used many to many relationship which created a intermediate table called shift grouping 
6. Main logic --> Returning true if the shift code is present in the set of shift groups 
7. Model classes shift and shiftgroup implements serializable as to join based on code as it is not primary key 
