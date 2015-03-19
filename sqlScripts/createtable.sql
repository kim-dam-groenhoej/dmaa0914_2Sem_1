use dmaa0914_2Sem_1;

	create table City(
		zipcode int not null primary key,
		name	nvarchar(100) not null	
	)

	create table Customer(
	 id			int			not null primary key identity(1,1),
	 fname      nvarchar(15) not null,
     lname      nvarchar(15)       not null,
     adress     nvarchar(100)     not null,
     zipcode    int not null,
	 phonenumber nvarchar(25) not null,
	 email		nvarchar(100) not null,
	 customertype int not null,
	 foreign key(zipcode) references City(zipcode)
	 );

	 create table Country(
		id int not null primary key identity(1,1),
		name nvarchar(100) not null
	 );

	 create table Invoice(
	 invoiceno int not null primary key identity(1,1) ,
	 paymentdate datetime not null,
	 total decimal(10,2) not null	 
	 );

	 create table SaleOrder(	
	 id			int			not null primary key identity(1,1),
	 [date]     datetime default(getDate()) not null,
     deliverystatus      int       not null,
     deliverydate     datetime     not null,
     customerid    int not null,
	 invoiceno		int not null
	 foreign key(customerid) references Customer(id),
	 foreign key(invoiceno) references Invoice(invoiceno)
	 );

	 create table Supplier(
	 id int not null primary key identity(1,1),
	 name nvarchar(max) not null,
	 [address] nvarchar(max) not null,
	 city nvarchar(max) not null,
	 phonenumber nvarchar(max) not null,
	 email nvarchar(max) not null,
	 countryid int not null,
	 foreign key(countryid) references Country(id)
	 );


	 create table Product(
	 id int not null primary key identity(1,1),
	 name nvarchar(max) not null,
	 purchaseprice decimal(10,2) not null,
	 salesprice decimal(10,2) not null,
	 rentprice decimal(10,2) null,
	 minstock int not null,
	 amountinstock int not null,
	 supplierid int not null,
	 countryid int not null,
	 foreign key(supplierid) references Supplier(id),
	 foreign key(countryid) references Country(id)
	 );
	
	 
	 create table PartOrder(
	 saleorderid int not null,
	 productid int not null,
	 amount int not null,
	 primary key (saleorderid, productid),
	 foreign key(saleorderid) references SaleOrder(id),
	 foreign key(productid) references Product(id)
	 );

	 create table Clothing(
	 productid int not null primary key,
	 size nvarchar(max) not null,
	 colour nvarchar(max) not null,
	 foreign key(productid) references Product(id)
	 );

	 create table Equipment(
	 productid int not null primary key,
	 [type] nvarchar(max) not null,
	 [description] nvarchar(max) not null,
	 foreign key(productid) references Product(id)
	 );

	 create table GunReplicas(
	 productid int not null primary key,
	 material nvarchar(max) not null,
	 calibre nvarchar(max) not null,
	 foreign key(productid) references Product(id)
	 );