name := "TimeoutAT"

version := "0.1"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "com.sikulix" % "sikulixapi" % "2.0.5",
  "org.scalatest"                 %% "scalatest"                % "3.2.6" % Test,
  "io.cucumber"                   %% "cucumber-scala"           % "6.9.1" % Test,
  "io.cucumber"                   % "cucumber-junit"            % "6.9.1" % Test,
  "junit"                         % "junit"                     % "4.13.2" % Test,
  "com.novocode"                  % "junit-interface"           % "0.11"  % Test,
  "org.seleniumhq.selenium"       % "selenium-java"             % "4.0.0"
)
