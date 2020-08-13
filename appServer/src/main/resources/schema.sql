CREATE TABLE wiringInstructions(
    intWiringInstructionsID Integer,
    vchWiringName varchar(50),
    vchBankName varchar(50),
    intObjectID Integer,
    PRIMARY KEY (intWiringInstructionsID)
);
CREATE TABLE products (
    intProductID Integer,
    varDescription varchar(50),
    intValue varchar(50),
    PRIMARY KEY (intProductID)
);
CREATE TABLE bank(
    intObjectID Integer,
    vchCommonName varchar(50),
    PRIMARY KEY (intObjectID)
);
CREATE TABLE productWiringInstructions(
    intProductID Integer,
    intWiringInstructionsID varchar(50)
);
INSERT INTO wiringInstructions VALUES
(1, 'Test Wiring Name', 'Test Bank Name', 123),
(2, 'Test Wiring Name 2', 'Test Bank Name 2', 345);
INSERT INTO products VALUES
(1, 'Description', 100),
(2, 'Description', 200);
INSERT INTO bank VALUES
(1, 'Object Name'),
(2, 'Object Name 2');
INSERT INTO productWiringInstructions values
(1, 1),
(2,2);
