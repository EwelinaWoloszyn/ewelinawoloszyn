<?php
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);

$mail->AddAddress ("woloszynewelina1@gmail.com","EwelinaWoloszyn");    //adres skrzynki e-mail oraz nazwa do potwierdzenia.
$mail->Send();

   $to = "woloszynewelina1@googlemail.com";
if(isset($_REQUEST['email'])){
$from = $_REQUEST['email'];}
if(isset($_REQUEST['name'])){
$name = $_REQUEST['name'];}
$headers = 'From: $from';
$subject = "You have a message sent from your site";
$fields = array();
if(isset($_REQUEST['email'])){
$fields{"email"} = "email";}
if(isset($_REQUEST['message'])){
$fields{'message'} = 'message';}
$body = "Here is what was sent:\n\n";
foreach ($fields as $a => $b) {
    $body .= sprintf("%20s: %s\n", $b, $_REQUEST[$a]);
}
$send = mail($to, $subject, $body, $headers);
?>