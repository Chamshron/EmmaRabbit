import "./globals.css";

export const metadata = {
  title: "Emma Rabbit Tracker",
  description: "Tracker for Lucky Emma Rabbit Figurines",
};

export default function RootLayout({ children }) {
  return (
    <html lang="en" className="!scroll-smooth">
      <body>{children}</body>
    </html>
  );
}
