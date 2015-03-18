USE [dmaa0914_2Sem_1]
GO

INSERT INTO [dbo].[Product]
           ([name]
           ,[purchaseprice]
           ,[salesprice]
           ,[rentprice]
           ,[countryoforigin]
           ,[minstock]
           ,[amountinstock]
           ,[supplierid])
     VALUES
           ('cowboyhat'
           , 149.95
           , 799.95
           ,NULL
           ,'USA'
           ,4
           ,5
           ,1);
GO


