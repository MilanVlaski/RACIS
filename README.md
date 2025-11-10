# Rent a car information system
A university project, for learning about information systems - basically enterprise [CRUD](https://en.wikipedia.org/wiki/Create,_read,_update_and_delete).

The application uses a big database with about 200 tables. If each can be interacted with by the user, how do we solve the problem of having to hard code the logic and properly display each table? Users aren't databases, and can't understand foreign keys.

## Use Cases

<!-- ### You may log in as an admin by default, or try any of the other available users (Projekat folder, in trunk/src/main/MainClass).

![Login](https://github.com/MilanVlaski/RACIS/assets/117462283/6202a051-981d-44d3-b543-2032ec144b40)
-->
### You may Create, Read, Update or Delete any information as needed. 

![Changing](https://github.com/MilanVlaski/RACIS/assets/117462283/a949d1bc-218a-4939-a76c-f223c0caedf7)
### Linked fields

The fields with question marks next to them are linked fields. That's because the data inside needs to come from a different table than the main one we are working with. Typing into them is forbidden. Instead, the user opens up a dialog that shows the linked table.
![Linked_input](https://github.com/MilanVlaski/RACIS/assets/117462283/02325e9a-dc82-4f1b-b17d-9b30c33ca081)

### Notes

- The application talks to the DB through stored procedures, which provide a simple entry point
- The DB schema is translated to an XML file, with data about which tables call which stored procedures, and the types of data that exist inside each column (whether it's "native" to the table, or is a foreign key)
- This is used to display the tables
- As well as for creating forms with input validation, handling data constraints.

## Status

- Successfuly completed. No changes expected, as the platform it runs on is Desktop + DB.
- Another enterprise CRUD app I'm making is for Forestry, using Apache Causeway. Stay tuned 😄

