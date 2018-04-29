#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
File generated = new File( basedir, "target/classes/README.txt" );

assert generated.readLines().each { line -> assert line.startsWith('-') }
