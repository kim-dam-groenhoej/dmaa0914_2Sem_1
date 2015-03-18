USE [WesternStyle]
GO

INSERT INTO [dbo].[City]
           ([zipcode]
           ,[name])
     VALUES
           (9000
           ,'Aalborg')

INSERT INTO [dbo].[City]
           ([zipcode]
           ,[name])
     VALUES
           (8900
           ,'Randers')

INSERT INTO [dbo].[Country]
           ([name])
     VALUES
           ('Danmark')

INSERT INTO [dbo].[Country]
           ([name])
     VALUES
           ('Ukraine')

INSERT INTO [dbo].[Customer]
           ([fname]
           ,[lname]
           ,[adress]
           ,[zipcode]
           ,[phonenumber]
           ,[email])
     VALUES
           ('franksbix'
           ,'frank'
           ,'frankevej 69'
           , 9000
           ,'98909829'
           ,'frank@frank.frank');

INSERT INTO [dbo].[Supplier]
 ([name]
           ,[address]
           ,[city]
           ,[countryid]
           ,[phonenumber]
           ,[email])
     VALUES
           ('frank',
           'cmdvej 42',
           'aalborg',
			1,
           '88888888',
           'mcD@mcDen.dk');

INSERT INTO [dbo].[Supplier]
 ([name]
           ,[address]
           ,[city]
           ,[countryid]
           ,[phonenumber]
           ,[email])
     VALUES
           ('tobias',
           'mc dvej 21',
           'aalborg',
           1,
           '22224444',
           'mctD@mcDen.dk');

INSERT INTO [dbo].[Supplier]
 ([name]
           ,[address]
           ,[city]
           ,[countryid]
           ,[phonenumber]
           ,[email])
     VALUES
           ('tobias',
           'hestevej 37, 4',
           'randers',
           1,
           '44442222',
           'hest@hest.hest');

INSERT INTO [dbo].[Product]
           ([name]
           ,[purchaseprice]
           ,[salesprice]
           ,[rentprice]
           ,[countryid]
           ,[minstock]
           ,[amountinstock]
           ,[supplierid])
     VALUES
           ('cowboyhat'
           , 149.95
           , 799.95
           ,NULL
           ,2
           ,4
           ,5
           ,1);

INSERT INTO [dbo].[Equipment]
           ([productid]
           ,[type]
           ,[description])
     VALUES
           (1,
		   'Hat',
           'kæft den er fed')