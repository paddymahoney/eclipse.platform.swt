#include <gtk/gtk.h>
#include "os_custom.h"

static void
activate (GtkApplication *app,
          gpointer        user_data)
{

  GtkWidget *window;
  GtkWidget *button;
  GtkWidget *button_box;
  GtkWidget *vbox;
  GtkWidget *fixed;
  GtkWidget *scrolled;

  window = gtk_application_window_new (app);
  gtk_window_set_title (GTK_WINDOW (window), "Window");
  gtk_window_set_default_size (GTK_WINDOW (window), 200, 200);

  vbox = gtk_box_new (GTK_ORIENTATION_VERTICAL, 0);
  scrolled = gtk_scrolled_window_new (NULL, NULL);
  gtk_container_add (GTK_CONTAINER (vbox), scrolled);

  fixed = swt_fixed_new ();
  gtk_container_add (GTK_CONTAINER (scrolled), fixed);

  button_box = gtk_button_box_new (GTK_ORIENTATION_HORIZONTAL);

  button = gtk_button_new_with_label ("Hello");
  gtk_container_add (GTK_CONTAINER (button_box), button);
  gtk_container_add (GTK_CONTAINER (fixed), button_box);
  gtk_container_add (GTK_CONTAINER (window), vbox);

  gtk_widget_show_all (window);
}

int
main (int    argc,
      char **argv)
{

  GtkApplication *app;
  int status;

  app = gtk_application_new ("org.gtk.example", G_APPLICATION_FLAGS_NONE);
  g_signal_connect (app, "activate", G_CALLBACK (activate), NULL);
  status = g_application_run (G_APPLICATION (app), argc, argv);
  g_object_unref (app);

  return status;
}
