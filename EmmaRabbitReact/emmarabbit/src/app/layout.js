import "./globals.css";
import localfont from "next/font/local";

const starflower = localfont({
  src: [{
    path: "../../public/fonts/STARFLOWER.otf",
    weight: "700",
  },
],
variable: "--font-starflower"
})


export const metadata = {
  title: "Emma Rabbit Tracker",
  description: "Tracker for Lucky Emma Rabbit Figurines",
};

export default function RootLayout({ children }) {
  return (
    <html lang="en" className={`${starflower.variable} font-sansmono`}>
      <body>{children}</body>
    </html>
  );
}
