USE [master]
GO
/****** Object:  Database [dbPetCare]    Script Date: 10-Jan-18 1:02:22 PM ******/
CREATE DATABASE [dbPetCare]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'dbPetCare', FILENAME = N'F:\workspace\GitRepos\Database\dbPetCare.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'dbPetCare_log', FILENAME = N'F:\workspace\GitRepos\Database\dbPetCare_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [dbPetCare] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [dbPetCare].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [dbPetCare] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [dbPetCare] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [dbPetCare] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [dbPetCare] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [dbPetCare] SET ARITHABORT OFF 
GO
ALTER DATABASE [dbPetCare] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [dbPetCare] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [dbPetCare] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [dbPetCare] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [dbPetCare] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [dbPetCare] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [dbPetCare] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [dbPetCare] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [dbPetCare] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [dbPetCare] SET  DISABLE_BROKER 
GO
ALTER DATABASE [dbPetCare] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [dbPetCare] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [dbPetCare] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [dbPetCare] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [dbPetCare] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [dbPetCare] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [dbPetCare] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [dbPetCare] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [dbPetCare] SET  MULTI_USER 
GO
ALTER DATABASE [dbPetCare] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [dbPetCare] SET DB_CHAINING OFF 
GO
ALTER DATABASE [dbPetCare] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [dbPetCare] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [dbPetCare] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [dbPetCare] SET QUERY_STORE = OFF
GO
USE [dbPetCare]
GO
ALTER DATABASE SCOPED CONFIGURATION SET IDENTITY_CACHE = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION SET LEGACY_CARDINALITY_ESTIMATION = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET LEGACY_CARDINALITY_ESTIMATION = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET MAXDOP = 0;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET MAXDOP = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET PARAMETER_SNIFFING = ON;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET PARAMETER_SNIFFING = PRIMARY;
GO
ALTER DATABASE SCOPED CONFIGURATION SET QUERY_OPTIMIZER_HOTFIXES = OFF;
GO
ALTER DATABASE SCOPED CONFIGURATION FOR SECONDARY SET QUERY_OPTIMIZER_HOTFIXES = PRIMARY;
GO
USE [dbPetCare]
GO
/****** Object:  Table [dbo].[AdminAccount]    Script Date: 10-Jan-18 1:02:22 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[AdminAccount](
	[Username] [nvarchar](50) NOT NULL,
	[Password] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_AdminAccount] PRIMARY KEY CLUSTERED 
(
	[Username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Client]    Script Date: 10-Jan-18 1:02:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Client](
	[id] [varchar](50) NOT NULL,
	[name] [nvarchar](250) NULL,
	[citizenId] [int] NULL,
	[address] [nvarchar](500) NULL,
	[phone] [varchar](50) NULL,
	[email] [varchar](50) NULL,
	[idPet] [varchar](50) NULL,
 CONSTRAINT [PK_Client] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 10-Jan-18 1:02:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[ID] [nvarchar](50) NOT NULL,
	[Name] [nvarchar](50) NULL,
	[Sex] [int] NULL,
	[CitizenID] [nvarchar](50) NULL,
	[Address] [nvarchar](250) NULL,
	[Phone] [nvarchar](50) NULL,
	[Email] [nvarchar](50) NULL,
	[NumPet] [int] NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Medicine]    Script Date: 10-Jan-18 1:02:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Medicine](
	[ID] [nvarchar](50) NOT NULL,
	[Name] [nvarchar](150) NULL,
	[Price] [varchar](50) NULL,
	[HSD] [varchar](50) NULL,
	[Effect] [nvarchar](500) NULL,
 CONSTRAINT [PK_Medicine] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Pet]    Script Date: 10-Jan-18 1:02:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Pet](
	[ID] [varchar](50) NOT NULL,
	[Name] [nvarchar](250) NULL,
	[IDBoss] [varchar](50) NOT NULL,
	[Sex] [int] NULL,
	[Age] [int] NULL,
	[Status] [nvarchar](2000) NULL,
 CONSTRAINT [PK_Pet_1] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[StaffAccount]    Script Date: 10-Jan-18 1:02:23 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[StaffAccount](
	[Username] [nvarchar](50) NOT NULL,
	[Password] [nvarchar](50) NOT NULL,
	[Name] [nvarchar](50) NOT NULL,
	[Sex] [int] NULL,
	[Age] [int] NULL,
	[Position] [nvarchar](50) NULL,
	[Address] [nvarchar](100) NULL,
	[Phone] [nvarchar](50) NULL,
	[Email] [nvarchar](50) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[AdminAccount] ([Username], [Password]) VALUES (N'admin', N'admin')
INSERT [dbo].[Client] ([id], [name], [citizenId], [address], [phone], [email], [idPet]) VALUES (N'C01', N'Ng?c', 197264627, N'Tru?ng d?i h?c khoa h?c t? nhiên', NULL, NULL, NULL)
INSERT [dbo].[Client] ([id], [name], [citizenId], [address], [phone], [email], [idPet]) VALUES (N'C04', N'Ng?cc', 197264627, N'Tru?ng d?i h?c khoa h?c t? nhiên', NULL, NULL, NULL)
INSERT [dbo].[Customer] ([ID], [Name], [Sex], [CitizenID], [Address], [Phone], [Email], [NumPet]) VALUES (N'KH001', N'Võ Hồng Ngân', 1, N'198274637', N'Huế', N'0983727183', N'hongnhan@outlook.com', NULL)
INSERT [dbo].[Customer] ([ID], [Name], [Sex], [CitizenID], [Address], [Phone], [Email], [NumPet]) VALUES (N'KH1', N'a', 0, N'1', N'1', N'1', N'1', 1)
INSERT [dbo].[Customer] ([ID], [Name], [Sex], [CitizenID], [Address], [Phone], [Email], [NumPet]) VALUES (N'KH1283839', N'Model', 0, N'1283839', N'28 ha ma', N'18283839', N'hhh', 2)
INSERT [dbo].[Customer] ([ID], [Name], [Sex], [CitizenID], [Address], [Phone], [Email], [NumPet]) VALUES (N'KH182828', N'DDmmm', 0, N'182828', N'hhhh', N'22882', N'22', 2)
INSERT [dbo].[Customer] ([ID], [Name], [Sex], [CitizenID], [Address], [Phone], [Email], [NumPet]) VALUES (N'KH182937482', N'Cô cô', 1, N'182937482', N'Lầu Ngưng Bích', N'0293848392', N'cococ@gmail.com', 1)
INSERT [dbo].[Customer] ([ID], [Name], [Sex], [CitizenID], [Address], [Phone], [Email], [NumPet]) VALUES (N'KH192838484', N'Dương Qúa', 0, N'192838484', N'Bán Đảo Sơn Trà', N'0920394848', N'quatroi@gmail.com', 1)
INSERT [dbo].[Customer] ([ID], [Name], [Sex], [CitizenID], [Address], [Phone], [Email], [NumPet]) VALUES (N'KH192949392', N'Đặng Nghĩa', 0, N'192949392', N'Hoa Qủa Sơn', N'039392949', N'hoason@gmail.com', 1)
INSERT [dbo].[Customer] ([ID], [Name], [Sex], [CitizenID], [Address], [Phone], [Email], [NumPet]) VALUES (N'KH198284838', N'Lý Mạc Sầu', 0, N'198284838', N'Trung HoA', N'0283848292', N'macsaupro@gmail.com', 1)
INSERT [dbo].[Customer] ([ID], [Name], [Sex], [CitizenID], [Address], [Phone], [Email], [NumPet]) VALUES (N'KH2', N'ư', 0, N'2', N'2', N'2', N'2', 1)
INSERT [dbo].[Customer] ([ID], [Name], [Sex], [CitizenID], [Address], [Phone], [Email], [NumPet]) VALUES (N'KH228382129', N'H', 0, N'228382129', N'HHH', N'29293', N'hoa@gmail.com', 2)
INSERT [dbo].[Medicine] ([ID], [Name], [Price], [HSD], [Effect]) VALUES (N'AC01', N'Ancohol', N'14000', N'2018-12-22', N'Chữa bệnh chán đời, chống thức ngủ')
INSERT [dbo].[Medicine] ([ID], [Name], [Price], [HSD], [Effect]) VALUES (N'PND01', N'Panadone', N'10000', N'2018-03-22', N'Trị đau đầu sổ mủi sốt')
INSERT [dbo].[Medicine] ([ID], [Name], [Price], [HSD], [Effect]) VALUES (N'XL01', N'Thần dược phương tây', N'69999', N'2069-01-01', N'Chữa bệnh nói nhảm')
INSERT [dbo].[Pet] ([ID], [Name], [IDBoss], [Sex], [Age], [Status]) VALUES (N'KH1283839P1', N'helo', N'KH1283839', 1, 3, N'3')
INSERT [dbo].[Pet] ([ID], [Name], [IDBoss], [Sex], [Age], [Status]) VALUES (N'KH1283839P2', N'3', N'KH1283839', 4, 4, N'2')
INSERT [dbo].[Pet] ([ID], [Name], [IDBoss], [Sex], [Age], [Status]) VALUES (N'KH182828P1', N'hu', N'KH182828', 1, 2, N'3')
INSERT [dbo].[Pet] ([ID], [Name], [IDBoss], [Sex], [Age], [Status]) VALUES (N'KH182828P2', N'ba', N'KH182828', 2, 2, N'33')
INSERT [dbo].[Pet] ([ID], [Name], [IDBoss], [Sex], [Age], [Status]) VALUES (N'KH192949392P1', N'Ha', N'KH192949392', 1, 2, N'3')
INSERT [dbo].[Pet] ([ID], [Name], [IDBoss], [Sex], [Age], [Status]) VALUES (N'KH228382129P1', N'h', N'KH228382129', 1, 2, N'3')
INSERT [dbo].[Pet] ([ID], [Name], [IDBoss], [Sex], [Age], [Status]) VALUES (N'KH228382129P2', N'm', N'KH228382129', 3, 4, N'5')
INSERT [dbo].[StaffAccount] ([Username], [Password], [Name], [Sex], [Age], [Position], [Address], [Phone], [Email]) VALUES (N'staff', N'staff', N'Staff Demo', 2, 20, N'Kĩ thuật viên', N'135 Trần Hưng Đạo', N'0123784293', N'1512378@student.hcmus.edu.vn')
INSERT [dbo].[StaffAccount] ([Username], [Password], [Name], [Sex], [Age], [Position], [Address], [Phone], [Email]) VALUES (N'doanket01', N'doanket00', N'Bùi Như Ngọc', 1, 20, N'Lao công', N'Quan 5', N'0982737382', N'doanket01@gmail.com')
INSERT [dbo].[StaffAccount] ([Username], [Password], [Name], [Sex], [Age], [Position], [Address], [Phone], [Email]) VALUES (N'hoangde', N'hoangde01', N'Le Hoang Thuong', 1, 18, N'Kỹ thuật viên', N'TP.HCM', N'0129347593', N'hoande@gmail.com')
INSERT [dbo].[StaffAccount] ([Username], [Password], [Name], [Sex], [Age], [Position], [Address], [Phone], [Email]) VALUES (N's', N's', N'New Staff', 0, 12, N'Quan ly', N'Bờ Hồ', N'092737382', N'sat@gmail.com')
USE [master]
GO
ALTER DATABASE [dbPetCare] SET  READ_WRITE 
GO
